import {request}from'../../request/index'
var util = require('../../utils/util.js')
Page({

    data: {
        fly:'',
        highrail:'',
        ship:'',
        train:'',
        metro:'',
        bus:'',
        car:'',
        moto:'',
        electaxi:'',
        gastaxi:'',
        drive:''
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
            fly:this.data.fly,
            highrail:this.data.highrail,
            ship:this.data.ship,
            train:this.data.train,
            metro:this.data.metro,
            bus:this.data.bus,
            car:this.data.car,
            moto:this.data.moto,
            electaxi:this.data.electaxi,
            gastaxi:this.data.gastaxi,
            drive:this.data.drive
        }
        request({
          url: '/carbonfootprint/traffic/addTraffic',
          data: data,
          method: 'POST'  
        }).then(res => {
            if(res){
                wx.showToast({
                  title: '记录成功！',
                  icon: 'success'
                })
                wx.setStorageSync('traffic', res)               
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