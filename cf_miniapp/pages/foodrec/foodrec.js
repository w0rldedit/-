import {request}from'../../request/index'
var util = require('../../utils/util.js')
Page({
    data: {
        riceAmount:'',
        grainsAmount:'',
        pulsesAmount:'',
        fishAmount:'',
        beefAmount:'',
        muttonAmount:'',
        porkAmount:'',
        chickenAmount:'',
        teaAmount:'',
        eggsAmount:'',
        oilAmount:'',
        vegetablesAmount:'',
        fruitAmount:'',
        flourAmount:'',
        alcoholAmount:'',
        milkAmount:'',
        sodasAmount:'',
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
            riceAmount:this.data.riceAmount,
            grainsAmount:this.data.grainsAmount,
            pulsesAmount:this.data.pulsesAmount,
            fishAmount:this.data.fishAmount,
            beefAmount:this.data.beefAmount,
            muttonAmount:this.data.muttonAmount,
            porkAmount:this.data.porkAmount,
            chickenAmount:this.data.chickenAmount,
            teaAmount:this.data.teaAmount,
            eggsAmount:this.data.eggsAmount,
            oilAmount:this.data.oilAmount,
            vegetablesAmount:this.data.vegetablesAmount,
            fruitAmount:this.data.fruitAmount,
            flourAmount:this.data.flourAmount,
            alcoholAmount:this.data.alcoholAmount,
            milkAmount:this.data.milkAmount,
            sodasAmount:this.data.sodasAmount,
        }
        request({
          url: '/carbonfootprint/food/addFood',
          data: data,
          method: 'POST'  
        }).then(res => {
            if(res){
                wx.showToast({
                  title: '记录成功！',
                  icon: 'success'
                })
                wx.setStorageSync('food', res)               
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