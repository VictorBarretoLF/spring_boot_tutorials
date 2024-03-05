package com.barreto.springcloudopenfeign1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    private String userId;
    private Long id;
    private String title;
    private String body;
    
}
