package dao;

import model.Employee;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class EmpDao {

    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(Employee p) {
        //String sql = "insert into Emp99(name,salary,designation) values('" + p.getClass().getName() + "'," + p.getClass().gets + ",'" + p.getDesignation() + "')";
        //return template.update(sql);
        return 0;
    }

    public int update(Employee p) {
        //String sql = "update Emp99 set name='" + p.getName() + "', salary=" + p.getSalary() + ",designation='" + p.getDesignation() + "' where id=" + p.getId() + "";
        //return template.update(sql);
        return 0;
    }

    public int delete(int id) {
        String sql = "delete from Emp99 where id=" + id + "";
        return template.update(sql);
    }

    public Employee getEmpById(int id) {
        String sql = "select * from Emp99 where id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Employee.class));
    }

    public List<Employee> getEmployees() {
        return template.query("select * from Emp99", new RowMapper<Employee>() {
            public Employee mapRow(ResultSet rs, int row) throws SQLException {
                Employee e = new Employee();
                return null;
            }

        });
    }
}

