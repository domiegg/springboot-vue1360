import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import chaungweishenqing from '@/views/modules/chaungweishenqing/list'
    import chuangwei from '@/views/modules/chuangwei/list'
    import dictionary from '@/views/modules/dictionary/list'
    import feiyongxinxi from '@/views/modules/feiyongxinxi/list'
    import liliaoxiangmu from '@/views/modules/liliaoxiangmu/list'
    import liuyan from '@/views/modules/liuyan/list'
    import news from '@/views/modules/news/list'
    import xiangmushenqing from '@/views/modules/xiangmushenqing/list'
    import xueshengqingjia from '@/views/modules/xueshengqingjia/list'
    import yisheng from '@/views/modules/yisheng/list'
    import yishengqingjia from '@/views/modules/yishengqingjia/list'
    import yizhu from '@/views/modules/yizhu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import dictionaryChaungweishenqingYesno from '@/views/modules/dictionaryChaungweishenqingYesno/list'
    import dictionaryChuangwei from '@/views/modules/dictionaryChuangwei/list'
    import dictionaryFeiyongxinxi from '@/views/modules/dictionaryFeiyongxinxi/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryLiliaoxiangmu from '@/views/modules/dictionaryLiliaoxiangmu/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionaryQingjia from '@/views/modules/dictionaryQingjia/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryXiangmushenqingYesno from '@/views/modules/dictionaryXiangmushenqingYesno/list'
    import dictionaryXueshengqingjiaYesno from '@/views/modules/dictionaryXueshengqingjiaYesno/list'
    import dictionaryYishengqingjiaYesno from '@/views/modules/dictionaryYishengqingjiaYesno/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryChaungweishenqingYesno',
        name: '申请状态',
        component: dictionaryChaungweishenqingYesno
    }
    ,{
        path: '/dictionaryChuangwei',
        name: '床位状态',
        component: dictionaryChuangwei
    }
    ,{
        path: '/dictionaryFeiyongxinxi',
        name: '缴费类型',
        component: dictionaryFeiyongxinxi
    }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryLiliaoxiangmu',
        name: '项目类型',
        component: dictionaryLiliaoxiangmu
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionaryQingjia',
        name: '请假类型',
        component: dictionaryQingjia
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryXiangmushenqingYesno',
        name: '申请状态',
        component: dictionaryXiangmushenqingYesno
    }
    ,{
        path: '/dictionaryXueshengqingjiaYesno',
        name: '审核结果',
        component: dictionaryXueshengqingjiaYesno
    }
    ,{
        path: '/dictionaryYishengqingjiaYesno',
        name: '审核结果',
        component: dictionaryYishengqingjiaYesno
    }


    ,{
        path: '/chaungweishenqing',
        name: '床位申请',
        component: chaungweishenqing
      }
    ,{
        path: '/chuangwei',
        name: '床位信息',
        component: chuangwei
      }
    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/feiyongxinxi',
        name: '费用信息',
        component: feiyongxinxi
      }
    ,{
        path: '/liliaoxiangmu',
        name: '理疗项目',
        component: liliaoxiangmu
      }
    ,{
        path: '/liuyan',
        name: '意见反馈',
        component: liuyan
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/xiangmushenqing',
        name: '项目申请',
        component: xiangmushenqing
      }
    ,{
        path: '/xueshengqingjia',
        name: '患者请假',
        component: xueshengqingjia
      }
    ,{
        path: '/yisheng',
        name: '医生',
        component: yisheng
      }
    ,{
        path: '/yishengqingjia',
        name: '医生请假',
        component: yishengqingjia
      }
    ,{
        path: '/yizhu',
        name: '医嘱',
        component: yizhu
      }
    ,{
        path: '/yonghu',
        name: '患者',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
