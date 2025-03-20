export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["新增","查看","修改","删除"],"menu":"班级信息","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","修改","删除"],"menu":"班级人员","menuJump":"列表","tableName":"banjirenyuan"}],"menu":"班级人员管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","修改","删除"],"menu":"学生请假","menuJump":"列表","tableName":"xueshengqingjia"}],"menu":"学生请假管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改","删除"],"menu":"班级职位","menuJump":"列表","tableName":"banjizhiwei"}],"menu":"班级职位管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["修改","查看"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"},{"appFrontIcon":"cuIcon-pay","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","申请加入"],"menu":"班级信息列表","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["新增","查看","修改"],"menu":"班级信息","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","审核","职位任命"],"menu":"班级人员","menuJump":"列表","tableName":"banjirenyuan"}],"menu":"班级人员管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","审核"],"menu":"学生请假","menuJump":"列表","tableName":"xueshengqingjia"}],"menu":"学生请假管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改"],"menu":"班级职位","menuJump":"列表","tableName":"banjizhiwei"}],"menu":"班级职位管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","申请加入"],"menu":"班级信息列表","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"教师","tableName":"jiaoshi"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"班级人员","menuJump":"列表","tableName":"banjirenyuan"}],"menu":"班级人员管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看"],"menu":"学生请假","menuJump":"列表","tableName":"xueshengqingjia"}],"menu":"学生请假管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看"],"menu":"班级职位","menuJump":"列表","tableName":"banjizhiwei"}],"menu":"班级职位管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","申请加入"],"menu":"班级信息列表","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
