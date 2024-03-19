// pages/register/register.js
import {request}from'../../request/index'
Page({

    data: {
        username:'',
        password:'',
        nickname:'',
        mobile:''

    },
    regis(){
        // 先构建请求的json
        let data = {
            username:this.data.username,
            password:this.data.password,
            nickname:this.data.nickname,
            mobile:this.data.mobile
        }
        // 发送请求给后台
        request({
          url: '/carbonfootprint/user/regUser',
          method: 'POST',
          data: data
        }).then(res => {
            if(res){
                wx.showToast({
                  title: '注册成功！',
                  icon: 'success'
                })
                wx.setStorageSync('user', res)
                // try {
                //     wx.setStorageSync('user', 'res')
                //   } catch (e) { }
                // 设一秒延迟以便用户看到弹出成功的图标
                setTimeout(()=>{
                    wx.navigateBack({
                      delta: 0,
                    })
                },1000)
               
            }
            else{
                wx.showToast({
                  title: '注册失败!',
                  icon:'error'
                })
            }
        })
    },
})