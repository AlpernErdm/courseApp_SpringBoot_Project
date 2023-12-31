package kodlama.io.ders.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "langTech")
public class LangTech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "langTechName")
    private String langTechName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "programmingLangId" )
    private ProgrammingLang programmingLang;
}
