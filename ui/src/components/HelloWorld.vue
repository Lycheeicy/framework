<template>
  <div>
    <el-container style="horiz-align: center;text-align: center;margin-left: 150px;margin-right: 150px">
      <el-header>
        <h1>{{msg}}</h1>
      </el-header>
      <el-main>
        <el-button @click="helloWorldTest">点击我测试接口</el-button>
      </el-main>
    </el-container>
  </div>
</template>

<script>
import {getHelloWorldMessage} from '../api/api'

export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  methods: {
    helloWorldTest () {
      console.log('posting…………')
      let data = {
        message: 'msg'
      }
      getHelloWorldMessage(data).then(json => {
        console.log(json.data)
        this.$alert({
          message: json.data
        })
      })
    }
  },
  created () {
  },
  mounted () {
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}

.grid-content{
  height: 500px;
}
</style>
