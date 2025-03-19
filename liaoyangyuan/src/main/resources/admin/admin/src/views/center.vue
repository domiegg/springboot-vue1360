<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                    <el-col :span="12">
           <el-form-item v-if="flag=='yisheng'"  label='医生工号' prop="yishengUuidNumber">
               <el-input v-model="ruleForm.yishengUuidNumber"  placeholder='医生工号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yisheng'"  label='医生姓名' prop="yishengName">
               <el-input v-model="ruleForm.yishengName"  placeholder='医生姓名' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yisheng'"  label='手机号' prop="yishengPhone">
               <el-input v-model="ruleForm.yishengPhone"  placeholder='手机号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
             <el-form-item v-if="flag=='yisheng'" label='头像' prop="yishengPhoto">
                 <file-upload
                         tip="点击上传照片"
                         action="file/upload"
                         :limit="3"
                         :multiple="true"
                         :fileUrls="ruleForm.yishengPhoto?ruleForm.yishengPhoto:''"
                         @change="yishengPhotoUploadChange"
                 ></file-upload>
             </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='患者姓名' prop="yonghuName">
               <el-input v-model="ruleForm.yonghuName"  placeholder='患者姓名' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='头像' prop="yonghuPhoto">
                 <file-upload
                         tip="点击上传照片"
                         action="file/upload"
                         :limit="3"
                         :multiple="true"
                         :fileUrls="ruleForm.yonghuPhoto?ruleForm.yonghuPhoto:''"
                         @change="yonghuPhotoUploadChange"
                 ></file-upload>
             </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='联系方式' prop="yonghuPhone">
               <el-input v-model="ruleForm.yonghuPhone"  placeholder='联系方式' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='邮箱' prop="yonghuEmail">
               <el-input v-model="ruleForm.yonghuEmail"  placeholder='邮箱' clearable></el-input>
           </el-form-item>
         </el-col>

        <!--<el-col :span="12" v-if="flag=='yonghu'">
            <el-form-item class="select" label="医生" prop="yishengId">
                <el-select v-model="ruleForm.yishengId" filterable placeholder="请选择医生" @change="yishengChange">
                    <el-option
                            v-for="(item,index) in yishengOptions"
                            v-bind:key="item.id"
                                            :label="item.yishengName"
                            :value="item.id">
                    </el-option>
                </el-select>
            </el-form-item>
        </el-col>-->
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='医生工号' prop="yishengUuidNumber">
                 <el-input v-model="yishengForm.yishengUuidNumber" disabled></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='医生姓名' prop="yishengName">
                 <el-input v-model="yishengForm.yishengName" disabled></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='手机号' prop="yishengPhone">
                 <el-input v-model="yishengForm.yishengPhone" disabled></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='头像' prop="yishengPhoto">
                 <el-image
                     style="width: 100px; height: 100px"
                     :src="yishengForm.yishengPhoto?yishengForm.yishengPhoto:''"
                     :fit="fit">
                 </el-image>
             </el-form-item>
         </el-col>
         <el-form-item v-if="flag=='users'" label="用户名" prop="username">
             <el-input v-model="ruleForm.username"
                       placeholder="用户名"></el-input>
         </el-form-item>
         <el-col :span="12">
             <el-form-item v-if="flag!='users'"  label="性别" prop="sexTypes">
                 <el-select v-model="ruleForm.sexTypes" placeholder="请选择性别">
                     <el-option
                             v-for="(item,index) in sexTypesOptions"
                             v-bind:key="item.codeIndex"
                             :label="item.indexName"
                             :value="item.codeIndex">
                     </el-option>
                 </el-select>
             </el-form-item>
         </el-col>
         <el-col :span="24">
             <el-form-item>
                 <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
             </el-form-item>
         </el-col>
     </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
        ruleForm: {},
        flag: '',
        usersFlag: false,
        // sexTypesOptions : [],
// 注册表 患者
    // 注册的类型字段 患者
        // 性别
        sexTypesOptions : [],
    // 注册的级联表 患者
        // 医生列表
        yishengOptions : [],
        yishengForm:{},
// 注册表 医生
    // 注册的类型字段 医生
        // 性别
        sexTypesOptions : [],
    };
  },
  mounted() {
    //获取当前登录用户的信息
    var table = this.$storage.get("sessionTable");
    this.sessionTable = this.$storage.get("sessionTable");
    this.role = this.$storage.get("role");
    if (this.role != "管理员"){
    }

    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
// 注册表 患者
    // 注册的级联表 患者
        if(table == 'yonghu'){
            this.yishengChange(this.ruleForm.yishengId);
        }
// 注册表 医生
      } else {
        this.$message.error(data.msg);
      }
    });

// 注册表 患者 的级联表
    // 注册的级联表 患者
        // 医生列表
    this.$http({
        url: `yisheng/page?page=1&limit=100`,
        method: "get"
    }).then(({ data }) => {
        if (data && data.code === 0) {
        this.yishengOptions = data.data.list;
        }else{
            this.$message.error(data.msg);
        }
    });
// 注册表 医生 的级联表

      this.$http({
          url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=sex_types`,
          method: "get"
      }).then(({ data }) => {
          if (data && data.code === 0) {
              this.sexTypesOptions = data.data.list;
          } else {
              this.$message.error(data.msg);
          }
      });
  },
  methods: {
    chongzhi() {
      this.$router.replace({ path: "/pay" });
    },
    yishengPhotoUploadChange(fileUrls) {
        this.ruleForm.yishengPhoto = fileUrls;
    },
    yonghuPhotoUploadChange(fileUrls) {
        this.ruleForm.yonghuPhoto = fileUrls;
    },
// 注册表的级联表
    yishengChange(id){
        this.$http({
            url: `yisheng/info/`+id,
            method: "get"
        }).then(({ data }) => {
            if (data && data.code === 0) {
                this.yishengForm = data.data;
            }
        });
    },


    onUpdateHandler() {
                         if((!this.ruleForm.yishengUuidNumber)&& 'yisheng'==this.flag){
                             this.$message.error('医生工号不能为空');
                             return
                         }

                         if((!this.ruleForm.yishengName)&& 'yisheng'==this.flag){
                             this.$message.error('医生姓名不能为空');
                             return
                         }

                             if( 'yisheng' ==this.flag && this.ruleForm.yishengPhone&&(!isMobile(this.ruleForm.yishengPhone))){
                                 this.$message.error(`手机应输入手机格式`);
                                 return
                             }
                         if((!this.ruleForm.yishengPhoto)&& 'yisheng'==this.flag){
                             this.$message.error('头像不能为空');
                             return
                         }

                         if((!this.ruleForm.yonghuName)&& 'yonghu'==this.flag){
                             this.$message.error('患者姓名不能为空');
                             return
                         }

                         if((!this.ruleForm.yonghuPhoto)&& 'yonghu'==this.flag){
                             this.$message.error('头像不能为空');
                             return
                         }

                         if((!this.ruleForm.yonghuPhone)&& 'yonghu'==this.flag){
                             this.$message.error('联系方式不能为空');
                             return
                         }

                             if( 'yonghu' ==this.flag && this.ruleForm.yonghuEmail&&(!isEmail(this.ruleForm.yonghuEmail))){
                                 this.$message.error(`邮箱应输入邮箱格式`);
                                 return
                             }
                         if((!this.ruleForm.yishengId)&& 'yonghu'==this.flag){
                             this.$message.error('医生不能为空');
                             return
                         }

        if((!this.ruleForm.sexTypes) && this.flag!='users'){
            this.$message.error('性别不能为空');
            return
        }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
        this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
