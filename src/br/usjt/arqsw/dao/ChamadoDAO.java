package br.usjt.arqsw.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;
import br.usjt.arqsw.dao.ConnectionFactory;


public class ChamadoDAO {

	
	public ArrayList<Chamado> listarChamado() throws IOException {
		String query = "select id_chamado, descricao, status, dt_abertura, dt_fechamento from chamado";
		ArrayList<Chamado> lista = new ArrayList<>();
		try(Connection conn = ConnectionFactory.getConnection();
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();){
			
			while(rs.next()) {
				Chamado chamado = new Chamado();
				chamado.setIdChamado(rs.getInt("id_chamado"));
				chamado.setDescricao(rs.getString("descricao"));
				chamado.setDtAbertura(rs.getString("dt_abertura"));
				chamado.setDtFechamento(rs.getString("dt_fechamento"));
			//	chamado.setFila(rs.getObject("id_fila"));
				lista.add(chamado);
			}
			
		} catch (SQLException e) {
			throw new IOException(e);
		}
		return lista;
	}


}
