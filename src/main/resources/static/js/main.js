
        Vue.component('AllOrders', {
            props: ['orders'],
            template: '<div> <i>({{orders.id}})</i>{{orders.firstName}}</div>'
        });

        var resourse = Vue.resource('order{/allOrder}');
        var Vue = new Vue({
            el: '#all',
            template: '<AllOrders :orders="orders"',
            data: {
                orders: [] = resourse
            }
        });
function addUser() {
    location.href = "localhost:8080/addOrder";
}