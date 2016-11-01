package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Disciplina;

/**
 *
 * @author Tafar
 */
public class DisciplinaDAO {

    public void salvar(Disciplina disciplina) {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO Disciplinas (nome, cargaHoraria, curso, numeroVagas, periodo)VALUES(?, ?, ?, ?, ?);";

        try {
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, disciplina.getNome());
            stmt.setInt(2, disciplina.getCargaHoraria());
            stmt.setString(3, disciplina.getCurso());
            stmt.setInt(4, disciplina.getNumeroVagas());
            stmt.setString(5, disciplina.getPeriodo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {            
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Detalhes:"+ ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    public void editar(Disciplina disciplina) {
        
       Connection conn = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       String sql = "UPDATE disciplinas SET nome = ?, cargaHoraria = ?, curso = ?, numeroVagas = ?, periodo = ? WHERE id = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, disciplina.getNome());
            stmt.setInt(2, disciplina.getCargaHoraria());
            stmt.setString(3, disciplina.getCurso());
            stmt.setInt(4, disciplina.getNumeroVagas());
            stmt.setString(5, disciplina.getPeriodo());
            stmt.setInt(6, disciplina.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Editado com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar! Detalhes: "+ ex.getMessage());
        }finally{
            ConnectionFactory.closeConnection(conn, stmt);
        }
       
    }

    public void excluir(Disciplina disciplina) {
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "DELETE FROM disciplinas WHERE id = ?;";
        
        try {
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, disciplina.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao  Excluir! Detalhes: " + ex.getMessage());
        }finally{
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    public List<Disciplina> consultarPorNome(Disciplina nome) {
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM disciplinas WHERE nome like ?;";
        
        List<Disciplina> listaDisciplina = new ArrayList<>();

        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + nome.getNome() + "%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Disciplina disciplina = new Disciplina();
                
                disciplina.setId(rs.getInt("id"));
                disciplina.setNome(rs.getString("nome"));
                disciplina.setCargaHoraria(rs.getInt("cargaHoraria"));
                disciplina.setCurso(rs.getString("curso"));
                disciplina.setNumeroVagas(rs.getInt("numeroVagas"));
                disciplina.setPeriodo(rs.getString("periodo"));
                
                listaDisciplina.add(disciplina);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(conn, stmt);
        }
        
        return listaDisciplina;
    }

    public List<Disciplina> consultarPorID(Disciplina id) {
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM disciplinas WHERE id = ?;";
        
        List<Disciplina> listaDisciplina = new ArrayList<>();
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id.getId());
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Disciplina disciplina = new Disciplina();
                
                disciplina.setId(rs.getInt("id"));
                disciplina.setNome(rs.getString("nome"));
                disciplina.setCargaHoraria(rs.getInt("cargaHoraria"));
                disciplina.setCurso(rs.getString("curso"));
                disciplina.setNumeroVagas(rs.getInt("numeroVagas"));
                disciplina.setPeriodo(rs.getString("periodo"));
                
                listaDisciplina.add(disciplina);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(conn, stmt);
        }
        
        return listaDisciplina;
    }

    public List<Disciplina> listar() {
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM disciplinas order by nome ASC;";
        
        List<Disciplina> listaDisciplina = new ArrayList<>();
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Disciplina disciplina = new Disciplina();
                
                disciplina.setId(rs.getInt("id"));
                disciplina.setNome(rs.getString("nome"));
                disciplina.setCargaHoraria(rs.getInt("cargaHoraria"));
                disciplina.setCurso(rs.getString("curso"));
                disciplina.setNumeroVagas(rs.getInt("numeroVagas"));
                disciplina.setPeriodo(rs.getString("periodo"));
                
                listaDisciplina.add(disciplina);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(conn, stmt);
        }

        return listaDisciplina;
    }      

}
