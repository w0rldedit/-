// pages/clothesrec/clothesrec.js
import {request}from'../../request/index'
var util = require('../../utils/util.js')
Page({

    data: {
        hatAmount:'',
        fabricAmount:'',
        denimAmount:'',
        cottonAmount:'',
        downAmount:'',
        shoesAmount:'',
        glovesAmount:'',
        swimwearAmount:'',
        scarveAmount:'',
        tieAmount:'',
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
            hatAmount:this.data.hatAmount,
            fabricAmount:this.data.fabricAmount,
            denimAmount:this.data.denimAmount,
            cottonAmount:this.data.cottonAmount,
            downAmount:this.data.downAmount,
            shoesAmount:this.data.shoesAmount,
            glovesAmount:this.data.glovesAmount,
            swimwearAmount:this.data.swimwearAmount,
            scarveAmount:this.data.scarveAmount,
            tieAmount:this.data.tieAmount,
        }
        request({
          url: '/carbonfootprint/clothes/addClothes',
          data: data,
          method: 'POST'  
        }).then(res => {
            if(res){
                wx.showToast({
                  title: '记录成功！',
                  icon: 'success'
                })
                wx.setStorageSync('clothes', res)               
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