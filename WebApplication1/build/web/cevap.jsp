<%-- 
    Document   : cevap.jsp
    Created on : Jan 16, 2017, 4:00:49 AM
    Author     : mhtkarakose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="ilkCekirdek" scope="session" class="Veri.Kisi" />
        <jsp:setProperty name="ilkCekirdek" property="isim"  />
        <jsp:setProperty name="ilkCekirdek" property="sifre"  />
        Merhaba .

        <% if(ilkCekirdek.sifreKontrol()){
            out.println("hosgsnz Siteme hoşgeldiniz.");
        }else{
                out.println("sifre hatali");
                }
        %>
        
    </body>
</html>
