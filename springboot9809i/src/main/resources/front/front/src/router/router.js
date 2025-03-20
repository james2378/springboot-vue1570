import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import jiaoshiList from '../pages/jiaoshi/list'
import jiaoshiDetail from '../pages/jiaoshi/detail'
import jiaoshiAdd from '../pages/jiaoshi/add'
import xueshengList from '../pages/xuesheng/list'
import xueshengDetail from '../pages/xuesheng/detail'
import xueshengAdd from '../pages/xuesheng/add'
import banjixinxiList from '../pages/banjixinxi/list'
import banjixinxiDetail from '../pages/banjixinxi/detail'
import banjixinxiAdd from '../pages/banjixinxi/add'
import banjirenyuanList from '../pages/banjirenyuan/list'
import banjirenyuanDetail from '../pages/banjirenyuan/detail'
import banjirenyuanAdd from '../pages/banjirenyuan/add'
import xueshengqingjiaList from '../pages/xueshengqingjia/list'
import xueshengqingjiaDetail from '../pages/xueshengqingjia/detail'
import xueshengqingjiaAdd from '../pages/xueshengqingjia/add'
import banjizhiweiList from '../pages/banjizhiwei/list'
import banjizhiweiDetail from '../pages/banjizhiwei/detail'
import banjizhiweiAdd from '../pages/banjizhiwei/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'jiaoshi',
					component: jiaoshiList
				},
				{
					path: 'jiaoshiDetail',
					component: jiaoshiDetail
				},
				{
					path: 'jiaoshiAdd',
					component: jiaoshiAdd
				},
				{
					path: 'xuesheng',
					component: xueshengList
				},
				{
					path: 'xueshengDetail',
					component: xueshengDetail
				},
				{
					path: 'xueshengAdd',
					component: xueshengAdd
				},
				{
					path: 'banjixinxi',
					component: banjixinxiList
				},
				{
					path: 'banjixinxiDetail',
					component: banjixinxiDetail
				},
				{
					path: 'banjixinxiAdd',
					component: banjixinxiAdd
				},
				{
					path: 'banjirenyuan',
					component: banjirenyuanList
				},
				{
					path: 'banjirenyuanDetail',
					component: banjirenyuanDetail
				},
				{
					path: 'banjirenyuanAdd',
					component: banjirenyuanAdd
				},
				{
					path: 'xueshengqingjia',
					component: xueshengqingjiaList
				},
				{
					path: 'xueshengqingjiaDetail',
					component: xueshengqingjiaDetail
				},
				{
					path: 'xueshengqingjiaAdd',
					component: xueshengqingjiaAdd
				},
				{
					path: 'banjizhiwei',
					component: banjizhiweiList
				},
				{
					path: 'banjizhiweiDetail',
					component: banjizhiweiDetail
				},
				{
					path: 'banjizhiweiAdd',
					component: banjizhiweiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
