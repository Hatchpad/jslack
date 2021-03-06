package com.github.seratch.jslack.api.methods.request.reactions;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReactionsGetRequest {

    private String token;
    private String file;
    private String fileComment;
    private String channel;
    private String timestamp;
    private boolean full;
}