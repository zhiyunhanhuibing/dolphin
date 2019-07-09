package com.zhiyun.modules.security.rest;
import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import com.zhiyun.modules.security.utils.VerifyCodeUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import com.zhiyun.modules.security.security.ImgResult;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;
/**
 * @author Zheng Jie
 * @date 2018-11-23
 * 授权、根据token获取用户详细信息
 */
@Slf4j
@RestController
@RequestMapping("auth")
public class AuthenticationController {


    /**
     * 获取验证码
     */
    @GetMapping(value = "vCode")
    public ImgResult getCode(HttpServletResponse response) throws IOException {

        //生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        String uuid = IdUtil.simpleUUID();
        //redisService.saveCode(uuid,verifyCode);
        // 生成图片
        int w = 111, h = 36;
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        VerifyCodeUtils.outputImage(w, h, stream, verifyCode);
        try {
            return new ImgResult(Base64.encode(stream.toByteArray()),uuid);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            stream.close();
        }
    }
}
