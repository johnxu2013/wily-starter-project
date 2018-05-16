package io.csra.wily.starter.thing.persistence;

import io.csra.wily.starter.thing.presentation.model.ThingDTO;

import java.util.List;

public interface ThingRepository {

    List<ThingDTO> getThings();

}

