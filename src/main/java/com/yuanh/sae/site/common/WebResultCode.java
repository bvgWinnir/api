package com.yuanh.sae.site.common;

import java.util.HashMap;
import java.util.Map;

/**
 * web端状态码
 */
public class WebResultCode {

    /**
     * 系统操作成功
     */
    public static final String SUCCESS = "10000000";

    /**
     * 系统异常
     */
    public static final String EXCEPTION = "10000001";

    /**
     * 对象没有找到
     */
    public static final String OBJECT_NOT_FOUND = "10000002";

    /**
     * 登陆密码错误
     */
    public static final String LOGIN_PASSWORD_ERROR = "10000003";

    /**
     * 没有授权
     */
    public static final String PREMISS_INVALIDE = "10000004";

    /**
     * 帐号锁定
     */
    public static final String ACCOUNT_LOCKED = "10000005";

    /**
     * 帐号禁用
     */
    public static final String ACCOUNT_UNPASSABLE = "10000006";

    /**
     * 帐号过期
     */
    public static final String ACCOUNT_EXPIRED = "10000007";
    /**
     * 帐号不存在
     */
    public static final String ACCOUNT_NOT_FOUND = "10000008";
    /**
     * 帐号不存在
     */
    public static final String CSRF_ERROR = "10000009";
    /**
     * 帐号登陆次数太多
     */
    public static final String LOGIN_TOO_MANY_TIMES = "10000014";
    /**
     * queryId已经存在
     */
    public static final String QUERY_IS_EXISTS = "10000010";
    /**
     * 该数据表关联关系已经存在
     */
    public static final String RELATION_IS_EXISTS = "10000011";
    /**
     * queryId和关联queryID不能一样
     */
    public static final String QUERY_RELATION_QUERY_REPEAT = "10000012";
    //可能是超时了
    public static final String ACCOUNT_OVERTIME = "10000013";

    //参数错误
    public static final String PARAMETER_ERROE = "10000015";

    //对象不能为空
    public static final String OBJECT_NOT_NULL = "10000050";

    //邮件发送错误
    public static final String EMAIL_ERROR = "10000051";

    //functionId不能为空
    public static final String FUNCTIONID_NOT_NULL = "10000052";

    //数据唯一标识不能为空
    public static final String ID_NOT_NULL = "10000053";

    //地点信息不能为空
    public static final String SITE_NOT_NULL = "10000054";

    //部门信息不能为空
    public static final String DEPART_NOT_NULL = "10000055";

    //上级ID不能为空
    public static final String PARENTID_NOT_NULL = "10000056";

    //option不能为空
    public static final String OPTION_NOT_NULL = "10000057";
    /**
     * 权限错误
     */
    public static final String PERMISSION_ERROR = "10000950";
    /**********************************  工作流 *********************************************/

    public static final String ACTIVITI_NOT_FOUND = "50000501";

    public static final String ACTIVITI_DEPLOY_ERROR = "50000502";
    /**
     * session失效
     */
    public static final String SESSION_FAILURE = "10000950";

    /*
    * 数据被锁定
    *
    * */
    public static final String DATA_LOCKED = "10000960";


    public static final Map<String, String> CODE_MSG = new HashMap<String, String>();

    static {
        CODE_MSG.put(SUCCESS, "系统操作成功");
        CODE_MSG.put(EXCEPTION, "系统异常");
        CODE_MSG.put(OBJECT_NOT_FOUND, "没有该条数据");
        CODE_MSG.put(LOGIN_PASSWORD_ERROR, "用户密码错误");
        CODE_MSG.put(PREMISS_INVALIDE, "该用户没有授权");
        CODE_MSG.put(ACCOUNT_LOCKED, "该用户被锁定");
        CODE_MSG.put(ACCOUNT_UNPASSABLE, "该用户被禁用");
        CODE_MSG.put(ACCOUNT_EXPIRED, "该用户已过期");
        CODE_MSG.put(ACCOUNT_NOT_FOUND, "该用户不存在");
        CODE_MSG.put(LOGIN_TOO_MANY_TIMES, "该用户登陆次数太多");
        CODE_MSG.put(CSRF_ERROR, "csrf过期");
        CODE_MSG.put(QUERY_IS_EXISTS, "queryId已经存在");
        CODE_MSG.put(RELATION_IS_EXISTS, "该数据表关联关系已经存在");
        CODE_MSG.put(QUERY_RELATION_QUERY_REPEAT, "queryId和关联queryID不能一样");
        CODE_MSG.put(ACCOUNT_OVERTIME, "用户登录超时");
        CODE_MSG.put(OBJECT_NOT_NULL, "对象不能为空");
        CODE_MSG.put(DATA_LOCKED, "该数据已被锁定，禁止操作");
        CODE_MSG.put(ACTIVITI_NOT_FOUND, "该工作流不存在");
        CODE_MSG.put(ACTIVITI_DEPLOY_ERROR, "工作流部署失败");
        CODE_MSG.put(PARAMETER_ERROE, "参数错误");
        CODE_MSG.put(EMAIL_ERROR, "发送邮件错误");
        CODE_MSG.put(FUNCTIONID_NOT_NULL,"functionId不能为空");
        CODE_MSG.put(ID_NOT_NULL,"数据唯一标识不能为空");
        CODE_MSG.put(SITE_NOT_NULL,"地点信息不能为空");
        CODE_MSG.put(DEPART_NOT_NULL,"部门信息不能为空");
        CODE_MSG.put(PARENTID_NOT_NULL,"上级ID不能为空");
        CODE_MSG.put(OPTION_NOT_NULL,"option不能为空");
    }

    /**
     * 获取异常result
     *
     * @param webResult
     * @return
     */
    public static WebResult getExceptionResult(WebResult webResult) {
        webResult.setSuccess(false);
        webResult.setCode(EXCEPTION);
        webResult.setMessage(WebResultCode.CODE_MSG.get(EXCEPTION));
        return webResult;
    }

    /**
     * 根据result状态码获取result消息
     *
     * @param webResult
     * @return
     */
    public static WebResult getMsgResult(WebResult webResult, String resultCode) {
        webResult.setMessage(WebResultCode.CODE_MSG.get(resultCode));
        webResult.setSuccess(SUCCESS.equals(resultCode));
        webResult.setCode(resultCode);
        return webResult;
    }
}
