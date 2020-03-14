var messageApi = Vue.resource('/orders');


Vue.component('order-row',{
    props: ['order'],
    template: '<div><i>({{order}</i></div>'

});
Vue.component('orders-list', {
    props: ['orders'],
    /*data: function () {
        return {
            orders: null
        }
    },*/
    template:'<div>'+'<order-row v-for="order in orders" :key="order.id"  order="order"/>'+'</div>',
    /*'<order-row v-for="order in orders" :key="order.id"  order="order"/>*/
    created: function () {
        messageApi.get().then(result =>
            result.json().then(data =>
        //.forEach(order => this.orders.push(order))
        data._embedded.orderList.forEach(order => this.orders.push(order))
    )
    )

    },
    methods: {
        editMethod: function (message) {
            this.message = message;
        }
    }
});
var example1 = new Vue({
    el: '#example-1',
    data: {
        counter: 0
    }
})
var all = new Vue({
    el: '#all',
    template: '<orders-list :orders="orders"/>',
    data:{
        orders:[]
    }
    /*,methods: {
        increase: function (event) {
            messageApi.get().then(result =>
                result.json().then(data =>
                    data._embedded.orderList.forEach(order => this.orders.push(order)) //data.orderList.forEach(order => this.orders.push(order))
        ))
        }}*/

});