// pages/userinfo/userinfo.js
import {request}from'../../request/index'

const app = getApp()

Page({
  data: {
    show: false,
    user:{}
  },
  showPopup() {
    this.setData({ show: true });
  },
  onClose() {
    this.setData({ show: false });
  },
  logout(){
    wx.navigateTo({
      url: '../login/login',
    })
  },
  onShow: function(e){                // 比onShow响应快
    const user = wx.getStorageSync('user')
    if(!user){
        wx.navigateTo({
          url: '../login/login',
        })
    }
    if(user.data.id){
      request({
        url: '/carbonfootprint/user/' + user.data.id,
        method: 'GET'
      }).then(res => {
          this.setData({
            user: res
          })
      })
    }
    else{
      wx.navigateTo({
        url: '../login/login',
      })
    }
  }
})