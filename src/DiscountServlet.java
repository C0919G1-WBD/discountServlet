import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="DiscountServlet", urlPatterns="/display-discount")
public class DiscountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        double price = Double.parseDouble(request.getParameter("txtPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("txtDiscountPercent"));

        double totalDiscount = price * discountPercent * 0.01;
        double amount = price - totalDiscount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Discount amount: " + totalDiscount +"<br>");
        writer.println("Discount price: " + amount + "<br>");
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
