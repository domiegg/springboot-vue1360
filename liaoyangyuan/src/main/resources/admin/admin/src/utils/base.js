const base = {
    get() {
        return {
            url : "http://localhost:8080/liaoyangyuan/",
            name: "liaoyangyuan",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/liaoyangyuan/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "疗养院管理系统"
        } 
    }
}
export default base
