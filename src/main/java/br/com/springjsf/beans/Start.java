package br.com.springjsf.beans;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@ViewScoped
@Named("start")
@Component
public class Start implements Serializable {


    private static final long serialVersionUID = 3872630831471142613L;


    @Getter
    @Setter
    private String hello;



    @PostConstruct
    public void init(){
        hello = "2222222222222222222222222             HEEELLLOOOO...........";
    }


}
