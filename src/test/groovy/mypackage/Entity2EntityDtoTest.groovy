package mypackage

import org.nomin.NominMapper
import org.nomin.core.Nomin
import spock.lang.Specification

class Entity2EntityDtoTest extends Specification {

    NominMapper nomin = new Nomin("entity2entitydto.groovy")

    def "test mapping Entity to EntityDto"() {
        given:
        Entity entity = new Entity(name: "test", test2: "foo")

        when:
        EntityDto dto = nomin.map(entity, EntityDto)

        then:
        dto.name == entity.name

        and:
        dto.test1 == entity.test2
    }
}
