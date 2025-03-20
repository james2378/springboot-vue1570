const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot9809i/",
            name: "springboot9809i",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot9809i/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "大学生班级管理系统"
        } 
    }
}
export default base
