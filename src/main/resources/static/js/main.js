var messageApi = Vue.resource('http://localhost:8080/orders');
var orderForSearch = Vue.resource('http://localhost:8080/orders/{id}');


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
var search=new Vue({
    el: '#search',
    data:{
        searchOrders:[]
    }
})

var all=new Vue({
    el: '#all',
   // template: '<orders-list :orders="orders"/>',
    data:{
        orders:[]=this.getAllOrders(),
        state: "default",
        show: true

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
function searchOrders() {


}