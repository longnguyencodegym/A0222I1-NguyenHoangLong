package ss16_io_text_file.bai_tap.quan_ly_dien_thoai.service;

import java.util.ArrayList;
import java.util.List;

public class PhoneService {
    import java.util.ArrayList;
import java.util.List;
import model.Phone;

    public class PhoneService {
        private List<Phone> phones = new ArrayList();

        public PhoneService() {
        }

        public void create(Phone phone) {
            int lastId = 0;
            if (this.phones.size() > 0) {
                lastId = ((Phone)this.phones.get(this.phones.size() - 1)).getId();
            }

            phone.setId(lastId + 1);
            this.phones.add(phone);
        }

        public List<Phone> findAll() {
            return this.phones;
        }

        public void delete(int id) {
            for(int i = 0; i < this.phones.size(); ++i) {
                if (((Phone)this.phones.get(i)).getId() == id) {
                    this.phones.remove(i);
                    break;
                }
            }

        }

        public List<Phone> search(String name) {
            List<Phone> result = new ArrayList();

            for(int i = 0; i < this.phones.size(); ++i) {
                if (((Phone)this.phones.get(i)).getName().contains(name)) {
                    result.add(this.phones.get(i));
                }
            }

            return result;
        }
}
