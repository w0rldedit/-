// pages/record/record.js
import {request}from'../../request/index'

const app = getApp()
Page({

    /**
     * 页面的初始数据
     */
    data: {
       clothes:{},
       food:{},
       room:{},
       traffic:{}
    },

    onShow: function(e){                // 比onShow响应快
        const clothes = wx.getStorageSync('clothes')
        if(clothes.data.id){
          request({
            url: '/carbonfootprint/clothes/' + clothes.data.id,
            method: 'GET'
          }).then(res => {
              this.setData({
                clothes: res
              })
          })
        }
        const food = wx.getStorageSync('food')
        if(food.data.id){
            request({
                url:'/carbonfootprint/food/'+food.data.id,
                method:'GET'
            }).then(res =>{
                this.setData({
                    food:res
                })
            })
        }
        const room = wx.getStorageSync('room')
        if(room.data.id){
            request({
                url:'/carbonfootprint/room/'+room.data.id,
                method:'GET'
            }).then(res =>{
                this.setData({
                    room:res
                })
            })
        }
        const traffic = wx.getStorageSync('traffic')
        if(traffic.data.id){
            request({
                url:'/carbonfootprint/traffic/'+traffic.data.id,
                method:'GET'
            }).then(res =>{
                this.setData({
                    traffic:res
                })
            })
        }
      }

})