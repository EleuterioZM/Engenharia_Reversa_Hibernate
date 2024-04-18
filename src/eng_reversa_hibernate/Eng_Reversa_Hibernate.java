package eng_reversa_hibernate;

import Util.Avaliacao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;
import UtilHibernate.HibernateUtil;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;

public class Eng_Reversa_Hibernate {

    public static void main(String[] args) {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da avaliação:"));
        String descricao = JOptionPane.showInputDialog("Digite a descrição da avaliação:");
        BigDecimal peso = new BigDecimal(JOptionPane.showInputDialog("Digite o peso da avaliação:"));

        Avaliacao novaAvaliacao = new Avaliacao();
        novaAvaliacao.setId(id); // Define o ID fornecido
        novaAvaliacao.setDescricao(descricao);
        novaAvaliacao.setPeso(peso);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(novaAvaliacao);

        transaction.commit();
        session.close();
        
        // Chamando o método para listar as avaliações após adicionar uma nova
        listarAvaliacoes();
    }

    public static void listarAvaliacoes() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Criando a consulta de forma alternativa
        String hql = "FROM Avaliacao";
        Query query = session.createQuery(hql);
        List<Avaliacao> avaliacoes = query.list();

        System.out.println("Avaliações cadastradas:");
        for (Avaliacao avaliacao : avaliacoes) {
            System.out.println(avaliacao);
        }

        session.getTransaction().commit();
        session.close();
    }
}
