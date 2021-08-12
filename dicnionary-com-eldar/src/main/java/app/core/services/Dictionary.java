package app.core.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.dao.EntryDao;
import app.core.entities.Entry;

@Service
@Transactional
public class Dictionary {

//	@Autowired
//	private SentenceDao sentenceDao;
	@Autowired
	private EntryDao entryDao;

	public int add(Entry entry) {
		entry = entryDao.save(entry);
		return entry.getId();
	}

	public Entry get(int entryId) {
		return entryDao.findById(entryId).orElse(null);
	}

	public Entry update(Entry entry) {
		Entry sysEntry = get(entry.getId());
		if (sysEntry != null) {
			sysEntry.setDefinition(entry.getDefinition());
			return sysEntry;
		} else {
			return null;
		}
	}

	public boolean delete(int entryId) {
		Entry entry = get(entryId);
		if (entry != null) {
			entryDao.delete(entry);
			return true;
		} else {
			return false;
		}
	}

}
