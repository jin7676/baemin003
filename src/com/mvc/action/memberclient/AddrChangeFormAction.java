package com.mvc.action.memberclient;

import javax.servlet.http.*;
import com.mvc.action.CommandAction;

public class AddrChangeFormAction implements CommandAction {

    @Override
    public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {

        request.setCharacterEncoding("UTF-8");
        System.out.println("- - - - AddrChangeFormAction - - - - ");
        ///////////////// 이 아래에 내용 넣으세요 /////////////////////////

        //

        ///////////////// 이 위에 내용 넣으세요 /////////////////////////
        return "/memberClient/AddrChangeForm.jsp";
    }

}
