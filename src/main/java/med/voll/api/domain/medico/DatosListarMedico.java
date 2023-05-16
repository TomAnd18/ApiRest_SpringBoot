package med.voll.api.domain.medico;

public record DatosListarMedico(Long id, String nombre, String especialidad, String documento, String email) {

    public DatosListarMedico(Medico medico) {
        this(medico.getId(), medico.getNombre(), medico.getEspecialidad().toString(), medico.getDocumento(), medico.getEmail());
    }
}
