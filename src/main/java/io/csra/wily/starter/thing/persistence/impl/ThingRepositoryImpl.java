package io.csra.wily.starter.thing.persistence.impl;

import io.csra.wily.starter.thing.persistence.ThingRepository;
import io.csra.wily.starter.thing.presentation.model.ThingDTO;
import io.csra.wily.components.converter.DozerMapperPlus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// import org.jooq.DSLContext;
// import static io.csra.wily.starter.database.Tables.*;

// @Transactional
@Repository
public class ThingRepositoryImpl implements ThingRepository {

    // @Autowired
	// private DSLContext dslContext;

    @Autowired
	private DozerMapperPlus objectMapper;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ThingRepositoryImpl.class);

	@Override
	public List<ThingDTO> getThings() {
		List<ThingDTO> things = new ArrayList<>();
		ThingDTO thing = new ThingDTO();
		thing.setDetails("The Wily Starter Project");
		thing.setCreatedBy("Nick DiMola");
		thing.setCreatedTime(new Date());
		thing.setModifiedBy("Nick DiMola");
		thing.setModifiedTime(new Date());
		things.add(thing);
		return things;
	}
}
