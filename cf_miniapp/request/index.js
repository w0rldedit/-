// 数据请求
let ajaxTimes = 0;
export const request = (params) => {
    ajaxTimes ++;
    wx.showLoading({
      title: '加载中',
      mask: true
    })
    // 后台的请求地址
    const baseUrl = 'http://localhost:8080';

    return new Promise((resolve,reject) => {
        wx.request({
            ...params,
            url: baseUrl+params.url,
            success:(result) => {
                resolve(result.data);
            },
            fail:(err) => {
                reject(err);
            },
            complete:() => {
                ajaxTimes --;
                if(ajaxTimes == 0){ //所有请求完成后再关闭提示
                    wx.hideLoading();
                }
            },
        })
    })
}