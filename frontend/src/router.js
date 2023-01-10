
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"
import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"

import MenuReadView from "./components/MenuReadView"
import MenuReadViewDetail from "./components/MenuReadViewDetail"
import OrderReadView from "./components/OrderReadView"
import OrderReadViewDetail from "./components/OrderReadViewDetail"
import OrderStoreManager from "./components/listers/OrderStoreCards"
import OrderStoreDetail from "./components/listers/OrderStoreDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"


import OrderStatusView from "./components/OrderStatusView"
import OrderStatusViewDetail from "./components/OrderStatusViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },
            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },

            {
                path: '/menuReads',
                name: 'MenuReadView',
                component: MenuReadView
            },
            {
                path: '/menuReads/:id',
                name: 'MenuReadViewDetail',
                component: MenuReadViewDetail
            },
            {
                path: '/orderReads',
                name: 'OrderReadView',
                component: OrderReadView
            },
            {
                path: '/orderReads/:id',
                name: 'OrderReadViewDetail',
                component: OrderReadViewDetail
            },
            {
                path: '/orderStores',
                name: 'OrderStoreManager',
                component: OrderStoreManager
            },
            {
                path: '/orderStores/:id',
                name: 'OrderStoreDetail',
                component: OrderStoreDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },


            {
                path: '/orderStatuses',
                name: 'OrderStatusView',
                component: OrderStatusView
            },
            {
                path: '/orderStatuses/:id',
                name: 'OrderStatusViewDetail',
                component: OrderStatusViewDetail
            },


    ]
})
