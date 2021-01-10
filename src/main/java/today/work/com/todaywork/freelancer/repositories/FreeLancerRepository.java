package today.work.com.todaywork.freelancer.repositories;

import org.springframework.data.repository.CrudRepository;

import today.work.com.todaywork.freelancer.Freelancer;


public interface FreeLancerRepository extends CrudRepository<Freelancer, Integer> {
    
    
}