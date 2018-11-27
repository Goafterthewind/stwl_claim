package com.adc.da.elk.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;


import java.util.List;

import com.adc.da.notify.service.NotifyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.adc.da.base.web.BaseController;
import com.adc.da.elk.entity.ElkEO;
import com.adc.da.elk.page.ElkEOPage;
import com.adc.da.elk.service.ElkEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: elk_wangchengxin
 * @Date:
*/

@RestController
@RequestMapping("/${restPath}/elk/elk")
@Api(description = "|ElkEO|")
public class ElkEOController extends BaseController<ElkEO> {

    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: elk_wangchengxin
     * @Date:
    */

    private static final Logger logger = LoggerFactory.getLogger(ElkEOController.class);

    /**
     * elkEOService
    */
    @Autowired
    private ElkEOService elkEOService;
    /**
     * notifyService
     * */
    @Autowired
    private NotifyService notifyService;

    /**
     * @Description: 分页查询
     * @Param: ElkEOPage page
     * @return: Result.success(getPageInfo(page.getPager(), rows))
     * @Author: elk_wangchengxin
     * @Date: 2018/11/27
    */

    @ApiOperation(value = "|ElkEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("elk:elk:page")
    public ResponseMessage<PageInfo<ElkEO>> page(ElkEOPage page) throws Exception {
        List<ElkEO> rows = elkEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: elk_wangchengxin
     * @Date:
    */

    @ApiOperation(value = "|ElkEO|查询")
    @GetMapping("")
    @RequiresPermissions("elk:elk:list")
    public ResponseMessage<List<ElkEO>> list(ElkEOPage page) throws Exception {
        return Result.success(elkEOService.queryByList(page));
    }

    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: elk_wangchengxin
     * @Date:
    */

    @ApiOperation(value = "|ElkEO|详情")
    @GetMapping("/{tid}")
    @RequiresPermissions("elk:elk:get")
    public ResponseMessage<ElkEO> find(@PathVariable String tid) throws Exception {
        return Result.success(elkEOService.selectByPrimaryKey(tid));
    }

    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: elk_wangchengxin
     * @Date:
    */

    @ApiOperation(value = "|ElkEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("elk:elk:save")
    public ResponseMessage<ElkEO> create(@RequestBody ElkEO elkEO) throws Exception {
        elkEOService.insertSelective(elkEO);
        return Result.success(elkEO);
    }

    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: elk_wangchengxin
     * @Date:
    */

    @ApiOperation(value = "|ElkEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("elk:elk:update")
    public ResponseMessage<ElkEO> update(@RequestBody ElkEO elkEO) throws Exception {
        elkEOService.updateByPrimaryKeySelective(elkEO);
        return Result.success(elkEO);
    }

    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: elk_wangchengxin
     * @Date:
    */

    @ApiOperation(value = "|ElkEO|删除")
    @DeleteMapping("/{tid}")
    @RequiresPermissions("elk:elk:delete")
    public ResponseMessage delete(@PathVariable String tid) throws Exception {
        elkEOService.deleteByPrimaryKey(tid);
        logger.info("delete from T_ELK where tid = {}", tid);
        return Result.success();
    }

    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: elk_wangchengxin
     * @Date:
    */

    @ApiOperation(value = "|ElkEO|发送邮件")
    @PostMapping("/sendEmail")
    public ResponseMessage<Object> sendEmail(HttpServletResponse response, HttpServletRequest request) {
       /* String toEmail=request.getParameter("toEmail");
        String emailTitle=request.getParameter("emailTitle");
        String content=request.getParameter("content");*/
        String toEmail = "17862123707@163.com";
        String emailTitle = "邮件标题";
        String content = "邮件内容";
        if (toEmail != null) {
            try {
                notifyService.sendEmail(toEmail, emailTitle, content);
            } catch (Exception e) {
                e.printStackTrace();
                return Result.error("对方邮件地址是-》" + toEmail + " 内容是-》 " + content);
            }
        }
        return Result.success();
    }

}
