// pages/login/login.js
 import {request}from'../../request/index'
Page({
    
    data: {
        username:'',
        password:''

    },
    login(){
        // 先构建请求的json
        let data = {
            username:this.data.username,
            password:this.data.password
        }
        // 发送请求给后台
        request({
          url: '/carbonfootprint/user/login',
          method: 'POST',
          data: data
        }).then(res => {
            if(res){
                wx.showToast({
                  title: '登录成功！',
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
                  title: '账号或密码错误!',
                  icon:'error'
                })
            }
        })
    },
    regis(){
        wx.navigateTo({
          url: '../register/register',
        })
    }
})