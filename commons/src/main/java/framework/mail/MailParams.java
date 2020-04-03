package framework.mail;

import lombok.Data;
import lombok.Value;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Data
@Value
public class MailParams {
    /**
     * 收件人
     */
    private String mailTo;

    /**
     * 邮件标题
     */
    private String title;

    /**
     * 邮件内容
     */
    private String content;

    /**
     * 附件
     */
    private List<File> attachments = new ArrayList<>();

    /**
     * 模板文件
     */
    private String templateFile;

    private String template;

    /**
     * 模板的参数集
     */
    private Map<String, Object> templateModels;

}
