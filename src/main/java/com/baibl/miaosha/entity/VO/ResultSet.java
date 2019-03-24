package com.baibl.miaosha.entity.VO;

public class ResultSet {

    //表明对应请求的返回处理结果，成功：success  失败：fail
    private String status;
    //若status返回succes，则data内返回给前端需要的json数据
    //若status返回fail，则data内返回同意的错误码格式
    private Object data;


    public static ResultSet create(Object result){
        return ResultSet.create(result,"success");
    }

    public static ResultSet create(Object result, String success){
        ResultSet resultSet = new ResultSet();
        resultSet.setData(result);
        resultSet.setStatus(success);

        return resultSet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
