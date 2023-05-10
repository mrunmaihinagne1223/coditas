package Servlet;

import DAO.CrmDAO;
import Entity.CRM;
import Entity.Issues;
import Entity.Role;
import Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;


@WebServlet("/")
public class Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    static Configuration cfg = new Configuration().configure();
    static SessionFactory factory = cfg.buildSessionFactory();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();


        try {
            switch (action) {

                case "/insertCrm":
                    insertCRM(request, response);
                    break;
                case "/listCrm":
                    showCrms(request, response);
                    break;
                case "/deleteCrm":
                    //deleteCrm(request,response);
                    break;
                case "/insertUser":
                    insertUser(request, response);
                    break;
                case "/listUser":
                    userList(request,response);
                    break;

                case "/insertIssue":
                    insertIssue(request,response);
                    break;
                case "/listIssues":
                    listIssues(request,response);
                    break;
                case "/listAllPendingIssues":
                    listAllPendingIssues(request,response);
                    break;
                case "/updateStatus":
                    updateStatus(request,response);
                    break;
                case "/editIssue":
                    editIssue(request,response);
                    break;
                case "/updateIssue":
                    updateIssue(request,response);
                    break;
                case "/history":
                    history(request,response);
                    break;
                case "/deleteIssue":
                    deleteIssue(request,response);
                    break;
                case "/listAllUsers":
                    listAllUsers(request,response);
                    break;
                case "/listAllIssuesAdmin":
                    listAllIssuesAdmin(request, response);
                    break;
                case "/editUser":
                    editUser(request,response);
                    break;
                case "/deleteUser":
                    deleteUser(request,response);
                    break;


            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();


        try {
            switch (action) {

                case "/insertCrm":
                    insertCRM(request, response);
                    break;
                case "/listCrm":
                    showCrms(request, response);
                    break;
                case "/deleteCrm":
                    //deleteCrm(request,response);
                    break;
                case "/insertUser":
                    insertUser(request, response);
                    break;
                case "/listUser":
                    userList(request,response);
                    break;

                case "/insertIssue":
                    insertIssue(request,response);
                    break;
                case "/listIssues":
                    listIssues(request,response);
                    break;
                case "/listAllPendingIssues":
                    listAllPendingIssues(request,response);
                    break;
                case "/updateStatus":
                    updateStatus(request,response);
                    break;
                case "/editIssue":
                    editIssue(request,response);
                    break;
                case "/updateIssue":
                    updateIssue(request,response);
                    break;
                case "/history":
                    history(request,response);
                    break;
                case "/deleteIssue":
                    deleteIssue(request,response);
                    break;
                case "/listAllUsers":
                    listAllUsers(request,response);
                    break;
                case "/listAllIssuesAdmin":
                    listAllIssuesAdmin(request, response);
                    break;
                case "/editUser":
                    editUser(request,response);
                    break;
                case "/deleteUser":
                    deleteUser(request,response);
                    break;


            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
    }

    private void editUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("id"));

        // Retrieve the issue object from the database.
        Session s = factory.openSession();
        Transaction tx = null;
        try {
            tx = s.beginTransaction();
            User user = s.get(User.class, userId);
            tx.commit();
            request.setAttribute("user", user); // Pass the issue object as an attribute.
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            throw new ServletException("Failed to retrieve issue.", ex);
        } finally {
            s.close();
        }

        // Forward the request to the edit.jsp page.
        RequestDispatcher dispatcher = request.getRequestDispatcher("/edit-user.jsp");
        dispatcher.forward(request, response);
    }

    private void listAllIssuesAdmin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Issues> issuesList = CrmDAO.selectAllPendingIssuesAdmin();
        request.setAttribute("issueList", issuesList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("all-issue-list-admin.jsp");
        dispatcher.forward(request, response);
    }
    private void listAllUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);

        List<User> userList = CrmDAO.selectAllUsers();
        request.setAttribute("userList", userList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("all-user-list.jsp");
        dispatcher.forward(request, response);
    }

    private void deleteIssue(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        CrmDAO.deleteTodo(id);
        response.sendRedirect("listAllPendingIssues");
    }


    private void history(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        System.out.println("in history controller");
        int cId = (int) session.getAttribute("crmId");
        List<Issues> issuesList = CrmDAO.selectHistory(cId);
        request.setAttribute("issueList", issuesList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("history.jsp");
        dispatcher.forward(request, response);
    }

    private void updateIssue(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        int crmId = (int)(session.getAttribute("crmId"));
        int issueId = Integer.parseInt(request.getParameter("id"));
        int uId = Integer.parseInt(request.getParameter("uid"));
        String type = request.getParameter("issueType");
        String desc = request.getParameter("description");
        String status = request.getParameter("status");
        LocalDate date = LocalDate.parse(request.getParameter("deadline"));
        Session s = factory.openSession();
        Transaction tx = null;

        tx = s.beginTransaction();

        Issues issue = s.get(Issues.class, issueId);
        User user = new User();
        user.setU_id(uId);
        System.out.println(uId);
        issue.setIssue_type(type);
        issue.setDescription(desc);
        issue.setStatus(status);
        issue.setUser(user);
        issue.setDeadline(date);
        s.save(issue);
        tx.commit();
        s.close();
        RequestDispatcher dispatcher;

        if(crmId != 0) {
            dispatcher = request.getRequestDispatcher("listAllPendingIssues");
        }else{
            dispatcher = request.getRequestDispatcher("listAllIssuesAdmin");
        }
        dispatcher.forward(request, response);
    }

    private void editIssue(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int issueId = Integer.parseInt(request.getParameter("id"));

        // Retrieve the issue object from the database.
        Session s = factory.openSession();
        Transaction tx = null;
        try {
            tx = s.beginTransaction();
            Issues issue = s.get(Issues.class, issueId);
            tx.commit();
            request.setAttribute("issue", issue); // Pass the issue object as an attribute.
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            throw new ServletException("Failed to retrieve issue.", ex);
        } finally {
            s.close();
        }

        // Forward the request to the edit.jsp page.
        RequestDispatcher dispatcher = request.getRequestDispatcher("/edit-issue.jsp");
        dispatcher.forward(request, response);
    }

    private void updateStatus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int issueId = Integer.parseInt(request.getParameter("id"));
        String status = request.getParameter("status");
        System.out.println(issueId);
        System.out.println(status);
        Session s = factory.openSession();
        Transaction tx = null;
        tx = s.beginTransaction();
        Issues issues = s.get(Issues.class, issueId);
        issues.setStatus(status);
        s.save(issues);
        tx.commit();

        RequestDispatcher dispatcher = request.getRequestDispatcher("listAllPendingIssues");
        dispatcher.forward(request, response);
    }

    private void listAllPendingIssues(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        int cId = (int) session.getAttribute("crmId");
        List<Issues> issuesList = CrmDAO.selectAllPendingIssues(cId);
        request.setAttribute("issueList", issuesList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("all-issue-list.jsp");
        dispatcher.forward(request, response);
    }

    private void insertIssue(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        String type = request.getParameter("type");
        String desc = request.getParameter("desc");

        int uId = (int) session.getAttribute("userId");
        User user = new User();
        user.setU_id(uId);
        LocalDate reportDate = LocalDate.now();
        LocalDate deadline = reportDate.plusDays(7);

        Issues issues = new Issues(type,desc,"Assigned",reportDate,deadline,user);
        CrmDAO.insertIssue(issues);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listIssues");
        dispatcher.forward(request, response);

    }

    private void listIssues(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(false);

        int uId = (int) session.getAttribute("userId");
        List<Issues> issuesList = CrmDAO.selectAllIssues(uId);
        request.setAttribute("issueList", issuesList);
        //request.setAttribute("c", cId);
        RequestDispatcher dispatcher = request.getRequestDispatcher("issue-list.jsp");
        dispatcher.forward(request, response);
    }

    private void userList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);


        int cId = (int) session.getAttribute("crmId");
        List<User> userList = CrmDAO.selectAllUser(cId);
        request.setAttribute("userList", userList);
        request.setAttribute("c", cId);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
        dispatcher.forward(request, response);
    }


    private void insertCRM(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        String cName = request.getParameter("name");
        String cEmail = request.getParameter("email");
        String cPassword = request.getParameter("password");
        int cPhone = Integer.parseInt(request.getParameter("phno"));


        CRM newCRM = new CRM(cName, cEmail, cPassword, cPhone);
        Role role = new Role(cEmail, cPassword, "CRM");
        CrmDAO.insertCRM(newCRM, role);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listCrm");
        dispatcher.forward(request, response);
    }

    private void showCrms(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CRM> crmList = CrmDAO.selectAllCrm();
        request.setAttribute("crmList", crmList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("crm-list.jsp");
        dispatcher.forward(request, response);
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        HttpSession session = request.getSession(false);

        String uName = request.getParameter("name");
        String uEmail = request.getParameter("email");
        String uPassword = request.getParameter("password");
        int uPhone = Integer.parseInt(request.getParameter("phno"));
        String uAddress = request.getParameter("address");
        int cId = (int) session.getAttribute("crmId");

        CRM crm = new CRM();
        crm.setC_id(cId);
        User user = new User(uName,uEmail,uPassword,uPhone,uAddress, crm);
        Role role = new Role(uEmail, uPassword, "User");
        CrmDAO.insertUser(user,role);

        RequestDispatcher dispatcher = request.getRequestDispatcher("listUser");
        dispatcher.forward(request, response);

        //Author author = s.get(Author.class, authorId);


//        int id = (int)session.getAttribute("crmId");
//        System.out.println(id);
//        List<CRM> crms = createQuery("from Crm where name = '"+email+"'").list();
//        CRM crm = crms.get(0);
//
//
//        User user = new User(uName, uEmail, uPassword, uPhone, uAddress);
//
//        crm.getUsers().add(user);
//        session.update(updateCrm);

    }
}
