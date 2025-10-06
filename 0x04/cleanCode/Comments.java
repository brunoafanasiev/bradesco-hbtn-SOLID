import java.util.Date;
import java.util.List;

public class Comments {

    public Owner getTestcaseOwner(Testcase testcase){};

    public Hours getHoursInQuarter(){};

    // TODO: Este método deve ser removido
    public void check() {
        return;
    }

    /**
     * Publica resultados com base na data informada.
     *
     * @param date data a partir da qual os resultados devem ser publicados
     * @return lista de entidades de resultado
     * @since 16.0
     */
    public List<Result> publishResults(Date date) {};
    }
}
