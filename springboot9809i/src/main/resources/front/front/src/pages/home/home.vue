<template>
<div class="home-preview" :style='{"width":"1200px","margin":"0 auto","background":"none"}'>


	<!-- 关于我们 -->
	<div :style='{"border":"2px solid #a4d9b7","padding":"30px","margin":"20px auto","borderRadius":"8px","flexWrap":"wrap","background":"rgba(255,255,255,1)","display":"flex","width":"1200px","position":"relative","justifyContent":"space-between","height":"400px"}'>
	  <div :style='{"padding":"0","margin":"24px 0 0","color":"#333","textAlign":"center","width":"32px","lineHeight":"1.2","fontSize":"32px","order":"1"}'>{{aboutUsDetail.title}}</div>
	  <div :style='{"padding":"0px","margin":"48px 0 0","color":"#888","textAlign":"left","display":"none","width":"12px","lineHeight":"1.2","fontSize":"20px","height":"40px","order":"2"}'>{{aboutUsDetail.subtitle}}</div>
	  <div :style='{"padding":"0px","flexWrap":"wrap","backgroundImage":"none","display":"flex","width":"45%","backgroundSize":"cover","position":"relative","height":"336px","order":"4"}'>
	    <img :style='{"width":"100%","margin":"0px","objectFit":"cover","borderRadius":"8px","display":"block","height":"100%"}' :src="baseUrl + aboutUsDetail.picture1">
	    <img :style='{"margin":"0 10px","objectFit":"none","flex":1,"display":"none","height":"0"}' :src="baseUrl + aboutUsDetail.picture2">
	    <img :style='{"width":"520px","objectFit":"cover","display":"none","height":"350px"}' :src="baseUrl + aboutUsDetail.picture3">
	  </div>
	  <div :style='{"border":"1px solid #a4d9b7","padding":"10px 20px 0px 20px","boxShadow":"inset 0px 0px 200px 0px #e2f6e9","margin":"0","color":"#666","textIndent":"2em","overflow":"hidden","borderRadius":"8px","background":"rgba(255,255,255,.5)","width":"45%","lineHeight":"24px","fontSize":"16px","height":"336px","order":"3"}' v-html="aboutUsDetail.content"></div>
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	</div>


	
<div class="news" :style='{"border":"2px solid #a4d9b7","padding":"20px","margin":"20px 0 0 0","borderRadius":"8px","flexWrap":"wrap","background":"rgba(255,255,255,1)","display":"flex","justifyContent":"space-between"}'>
	
	<div class="title" :style='{"width":"auto","padding":"0px","margin":"0px  ","lineHeight":"54px","textAlign":"left","order":"0"}'>
		<span :style='{"padding":"10px","borderColor":"#55b44b","fontSize":"32px","color":"#000","borderStyle":"solid","borderWidth":" 0 0 5px 0"}'>公告信息</span>
	</div>
	
	
	
	
	
	
	
	
	
	
	<!-- 样式九 -->
	<div v-if="newsList.length" class="list list9 index-pv1" :style='{"padding":"0px","margin":"20px auto","background":"none","flexDirection":"column","display":"flex","width":"100%","height":"auto","order":"4"}'>
	  <div v-for="(item,index) in newsList" v-if="index<6" :key="index" @click="toDetail('newsDetail', item)" :style='{"cursor":"pointer","padding":"20px","margin":"0px 0","borderColor":"#bee4cc","background":"none","borderWidth":"0 0 1px 0","width":"100%","position":"relative","borderStyle":"solid","height":"auto"}' class="new9-list-item animation-box">
		<div :style='{"margin":"0 100px 10px","whiteSpace":"nowrap","overflow":"hidden","color":"#333","textAlign":"left","background":"none","width":"calc(100% - 180px)","fontSize":"16px","lineHeight":"28px","textOverflow":"ellipsis"}' class="new9-list-item-title line1">{{ item.title }}</div>
		<div :style='{"fontSize":"12px","lineHeight":"24px","position":"absolute","right":"10px","color":"#999","top":"20px"}' class="new9-list-item-time">{{ item.addtime.split(' ')[0] }}</div>
	    <div :style='{"margin":"0 100px","whiteSpace":"nowrap","overflow":"hidden","color":"#666","textAlign":"left","background":"none","width":"calc(100% - 180px)","fontSize":"14px","lineHeight":"24px","textOverflow":"ellipsis","height":"24px"}' class="new9-list-item-descript line2">{{ item.introduction }}</div>
		<div :style='{"padding":"12px","color":"#fff","borderRadius":"12px","textAlign":"center","background":"radial-gradient(circle, rgba(95,218,140,1) 0%, rgba(61,183,105,1) 100%)","bottom":"10px","display":"inline-block","width":"40px","fontSize":"14px","lineHeight":"1.1","position":"absolute","height":"80px"}' class="new9-list-item-identification">新闻动态</div>
	  </div>
	</div>
	
	
	<div @click="moreBtn('news')" :style='{"border":"0","padding":"0 24px","margin":"0","borderRadius":"30px","textAlign":"center","background":"#3db769","display":"block","width":"auto","lineHeight":"40px","height":"40px","order":"0"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"14px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"14px"}' class="el-icon-d-arrow-right"></i>
	</div>
	
	<div v-if="false" class="idea newsIdea" :style='{"padding":"0","flexWrap":"wrap","background":"#fff","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"140%","background":"rgba(227, 232, 222,1)","height":"10px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#cce199","height":"60px"}'></div>
		<div class="box3" :style='{"width":"15%","background":"#8ac998","height":"120px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#cce199","height":"60px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
</div>


<div class="lists" :style='{"border":"2px solid #a4d9b7","padding":"20px","margin":"20px 0 0 0","borderRadius":"8px","flexWrap":"wrap","background":"rgba(255,255,255,1)","display":"block","position":"relative","justifyContent":"space-between"}'>
	<div v-if="false" class="idea" :style='{"padding":"0","flexWrap":"wrap-reverse","background":"#fff","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"140%","background":"rgba(227, 232, 222,1)","height":"10px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#8ac998","height":"120px"}'></div>
		<div class="box3" :style='{"width":"15%","background":"#cce199","height":"60px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#8ac998","height":"120px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"padding":"0px","margin":"0","textAlign":"left","background":"0","width":"auto","lineHeight":"54px","order":"1"}'>
	  <span :style='{"padding":"10px","borderColor":"#55b44b","fontSize":"32px","color":"#000","borderStyle":"solid","borderWidth":" 0 0 5px 0"}'>班级信息展示</span>
	</div>
	
	
	
	
	<!-- 样式三 -->
	<div class="list list3 index-pv1">
		<div class="swiper-container" id="listsbanjixinxi" :style='{"width":"100%","padding":"10px","margin":"20px 0 0 0","background":"#fff","height":"auto","order":"4"}'>
			<div class="swiper-wrapper">
				<div class="swiper-slide animation-box" :style='{"border":"0px solid #bee4cc","cursor":"pointer","padding":"4px","borderRadius":"4px","background":"#fff","fontSize":"0","position":"relative"}' v-for="(item,index) in banjixinxiList" :key="index" @click="toDetail('banjixinxiDetail', item)">
					<img :name="item.id" :style='{"border":"1px solid #bee4cc","width":"100%","objectFit":"contain","background":"#fff","height":"220px"}' v-if="preHttp(item.banjitupian)" :src="item.banjitupian.split(',')[0]" alt="" />
					<img :name="item.id" :style='{"border":"1px solid #bee4cc","width":"100%","objectFit":"contain","background":"#fff","height":"220px"}' v-else :src="baseUrl + (item.banjitupian?item.banjitupian.split(',')[0]:'')" alt="" />
					<div class="name line1" :style='{"padding":"0 10px","borderColor":"#e1f6e9","color":"#333","textAlign":"center","background":"#f1fdf5","borderWidth":"0 0 1px 0","fontSize":"14px","lineHeight":"32px","borderStyle":"solid"}'>{{item.banjimingcheng}}</div>
            </div>
        </div>
			<!-- 如果需要导航按钮 -->
			<div class="swiper-button-prev"></div>
			<div class="swiper-button-next"></div>
		</div>
	</div>
	
	
	
	
	
	
	
	<div @click="moreBtn('banjixinxi')" :style='{"border":"0","padding":"0 24px","margin":"0","textAlign":"center","display":"block","right":"20px","borderRadius":"30px","top":"20px","background":"#3db769","width":"auto","lineHeight":"40px","position":"absolute","height":"40px","order":"2"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"14px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"12px"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>


</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        aboutUsDetail: {},
        newsList: [],

        banjixinxiList: [],
      }
    },
    created() {
      this.baseUrl = this.$config.baseUrl;
      this.getNewsList();
      this.getAboutUs();
      this.getList();
    },
    //方法集合
    methods: {
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
      getAboutUs() {
          this.$http.get('aboutus/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.aboutUsDetail = res.data.data;
            }
          })
      },
		getNewsList() {
			this.$http.get('news/list', {params: {
				page: 1,
				limit: 5,
                sort: 'addtime',
			order: 'desc'}}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
          let autoSortUrl = "";
			
			this.$http.get('banjixinxi/list', {params: {
				page: 1,
				limit: 8,
			}}).then(res => {
				if (res.data.code == 0) {
					this.banjixinxiList = res.data.data.list;
					let options = {"observer":true,"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"observeParents":true,"loop":true,"slidesPerView":5,"speed":500,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					this.$nextTick(() => {
						new Swiper ('#listsbanjixinxi', options)
					})
					
					// 商品列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {detailObj: JSON.stringify(item)}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
	
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(165, 195, 180);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(165, 195, 180);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0) scale(0.98) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: translate3d(-2px, -2px, 20px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: 0;
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: #3db769;
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: #3db769;
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0) scale(0.98) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: 0;
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
</style>
