var messageApi = Vue.resource('http://localhost:8080/orders');
var orderForSearch = 'http://localhost:8080/orders/';


Vue.component('order-row',{
    props: ['order'],
    template: '<div><i>({{order.id}})</i>{{order.firm}}</div>',

});
Vue.component('orders-list', {
    props: ['orders'],
    /*data: function () {
        return {
            orders: null
        }
    },*/
    template:'<div>'+
        '<order-row v-for="(order,id) in orders" :key="id"  :order="order"/>'+
        '</div>',
    /*'<order-row v-for="order in orders" :key="order.id"  order="order"/>*/
    created: function () {
        messageApi.get().then(result =>
            result.json().then(data =>
        //.forEach(order => this.orders.push(order))
        data._embedded.orderList.forEach(order => this.orders.push(order))
    )
    )

    }
});
var back = new Vue({
    data: {
        // declare message with an empty value
        ordersSearch: []
    },
    template: '<div>{{ ordersSearch.id }}  {{ordersSearch.firm}}  {{ordersSearch.warranty}}</div>'
})
new Vue({
    el: '#search',
    data:{ordersSearch:[]},
    methods: {
        searchById: function (message) {
            orders = []
            Vue.resource(orderForSearch+message).get().then(result =>
            result.json().then(data =>
            //.forEach(order => this.orders.push(order))\
                orders.push(data)
        )
        )

           // back.searchOrders = this.ordersSearch
            console.log(orders)
            this.ordersSearch = orders
        }
    },
})


var all=new Vue({
    el: '#all',
   // template: '<orders-list :orders="orders"/>',
    data:{
        orders:[]=this.getAllOrders(),
        state: "default",
        show: false

    }

});
function getAllOrders() {
    allOrders=[],
    messageApi.get().then(result =>
    result.json().then(data =>
    //.forEach(order => this.orders.push(order))
    data._embedded.orderList.forEach(order => allOrders.push(order))
)
)
return allOrders
}
