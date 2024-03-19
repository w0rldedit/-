// index.js
// 获取应用实例

Page({
    
    data: {
        time: 67189 * 60 * 60 * 1000,
        activeName: '1',
        date: '',
        show: false,
        swiperList: ['../../image/swipper1.png','../../image/swipper2.png','../../image/swipper3.png'],
        active: 0,
        steps: [
            {
              text: '衣',
            },
            {
              text: '食',
            },
            {
              text: '住',
            },
            {
              text: '行',
            },
          ],
      },
      onChange(event) {
        this.setData({
          activeName: event.detail,
        });
      },

      onClick(event) {
        wx.showToast({
          title: `切换到 ${event.detail.name}`,
          icon: 'none',
        });
      },
      onDisplay() {
        this.setData({ show: true });
      },
      onClose() {
        this.setData({ show: false });
      },
      formatDate(date) {
        date = new Date(date);
        return `${date.getMonth() + 1}/${date.getDate()}`;
      },
      onConfirm(event) {
        const [start, end] = event.detail;
        this.setData({
          show: false,
          date: `${this.formatDate(start)} - ${this.formatDate(end)}`,
        });
      },
      upload(){
        wx.switchTab({
          url: '../record/record',
        })
      }
 
})
