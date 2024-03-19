import {request}from'../../request/index'
var util = require('../../utils/util.js')
Page({
    data: {
        water:'',
        elec:'',
        coal:'',
        gas:'',
        coalgas:'',
        wooden:'',
        waste:'',
        hotel:'',
      },
      submit() {
        var time = util.formatTime(new Date())
        this.setData({
            time:time
        })
        const user = wx.getStorageSync('user')
        let data={
            createId:user.data.id,
            createDate:time,
            water:this.data.water,
            elec:this.data.elec,
            coal:this.data.coal,
            gas:this.data.gas,
            coalgas:this.data.coalgas,
            wooden:this.data.wooden,
            waste:this.data.waste,
            hotel:this.data.hotel,
        }
        request({
          url: '/carbonfootprint/room/addRoom',
          data: data,
          method: 'POST'  
        }).then(res => {
            if(res){
                wx.showToast({
                  title: '记录成功！',
                  icon: 'success'
                })
                wx.setStorageSync('room', res)               
            }
            else{
                wx.showToast({
                  title: '错误!',
                  icon:'error'
                })
            }
        })
        wx.navigateBack({
          delta: 0,
        })
      }
})