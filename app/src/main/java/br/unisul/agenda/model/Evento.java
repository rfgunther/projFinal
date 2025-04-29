package br.unisul.agenda.model;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Evento {
    public String nome;
    public String endereco;
    public String descricao;
    public TipoEvento tipo;
    public LocalDateTime horario;
    public List<Usuario> participantes = new ArrayList<>();
}
