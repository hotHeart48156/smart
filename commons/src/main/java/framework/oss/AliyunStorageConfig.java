package framework.oss;

import framework.oss.group.AliyunGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotBlank;

@Data
public class AliyunStorageConfig {
    @NotBlank(message = "阿里云绑定的域名不能为空", groups = AliyunGroup.class)
    @URL(message = "阿里云绑定的域名格式不正确", groups = AliyunGroup.class)
    private String aliyunDomain;
    //阿里云路径前缀
    private String aliyunPrefix;
    //阿里云EndPoint
    @NotBlank(message = "阿里云EndPoint不能为空", groups = AliyunGroup.class)
    private String aliyunEndPoint;
    //阿里云AccessKeyId
    @NotBlank(message = "阿里云AccessKeyId不能为空", groups = AliyunGroup.class)
    private String aliyunAccessKeyId;
    //阿里云AccessKeySecret
    @NotBlank(message = "阿里云AccessKeySecret不能为空", groups = AliyunGroup.class)
    private String aliyunAccessKeySecret;
    //阿里云BucketName
    @NotBlank(message = "阿里云BucketName不能为空", groups = AliyunGroup.class)
    private String aliyunBucketName;

}
