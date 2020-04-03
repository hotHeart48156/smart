package framework.sms;

import lombok.Data;

import java.util.List;
@Data
public class SmsParameter {
    private String templateCode;
    private String signName;
    private List<String> phoneNumbers;
    private String params;
}
