package com.chauhan.springboot.mydiary.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chauhan.springboot.mydiary.entity.Entry;
import com.chauhan.springboot.mydiary.service.EntryService;

@RestController
public class HomeController {

	@Autowired
	private EntryService entryService;
	
	@GetMapping("/entries/")
	public List<Entry> findAllEntries()
	{
		List<Entry> entrieslist=entryService.findAll();
		
		return entrieslist;
		
	}
	
	@PostMapping("/entries")
	public Entry saveEntry(@RequestBody Entry entry)
	{
		Entry saveEntry=entryService.saveEntry(entry);
		
		return saveEntry;
	}
	
	@PutMapping("/entries")
	public Entry updateEntry(@RequestBody Entry entry)
	{
		Entry updatedEntry=entryService.updateEntry(entry);
		
		return updatedEntry;
		
	}
	
	@PutMapping("/entries/{id}")
	public Entry updateEntry1(@PathVariable("id") long id ,  @RequestBody Entry entry)
	{
		Entry entry1 = entryService.findById(id);//entry1 is from db
		
		entry1.setDescription(entry.getDescription());
		entry1.setEntrydate(entry.getEntrydate());
		entry1.setUserid(entry.getUserid());
		
		Entry updatedEntry=entryService.updateEntry(entry1);
		
		return updatedEntry;
		
	}
	
	
	@PatchMapping("/entries/{id}")
	public Entry updateEntry2(@PathVariable("id") long id , @RequestBody Entry entry)
	{
		Entry entry1 = entryService.findById(id);//entry1 is from db
		
		String desc=entry.getDescription();
		Date dt=entry.getEntrydate();
		long usrid=entry.getUserid();
		
		if(desc!=null && desc.length()>0)
		entry1.setDescription(entry.getDescription());
		
		if(dt!=null)
		entry1.setEntrydate(entry.getEntrydate());
		
		if(usrid>0)
		entry1.setUserid(entry.getUserid());
		
		Entry updatedEntry=entryService.updateEntry(entry1);
		
		return updatedEntry;
		
	}
	
	
	
	
	@GetMapping("/entries/{id}")
		public Entry getEntry(@PathVariable("id") long id)
		{
		Entry entry = entryService.findById(id);
		
		return entry;
		
	}
	
	@DeleteMapping("/entries/{id}")
		public void deleteEntry(@PathVariable("id") long id)
		{

        Entry entry = entryService.findById(id);
        
        entryService.deleteEntry(entry);
        
        System.out.println("SUCCESSFULLY DELETED-200");
        
		
		
		}

	
	
	
	
}
