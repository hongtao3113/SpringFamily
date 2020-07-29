package com.google.service.core;

import com.google.dto.BaseMessage;
import com.google.dto.WeChatResult;

import java.util.Map;

public interface CodeHandleService {

    WeChatResult handleCode(Map<String, String> params, BaseMessage msgInfo);
}