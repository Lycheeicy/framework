import axios from "axios";

const url = 'http://localhost:8081/'

export function getHelloWorldMessage(data){
  return axios({
    method: 'get',
    url: url+'test/helloWorld',
    dataType: 'json',
    params:data
  })
}

export function uploadFile(data){
  return axios({
    method: 'get',
    data:data,
    url: url+'test/upload',
    dataType: 'form'
  })
}
