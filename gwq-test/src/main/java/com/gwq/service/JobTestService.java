/*
 * Copyright (C) 2018 @内蒙古慧瑞.
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.gwq.service;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * <Description/>
 *
 * @author guowq.
 * @Date 2021/1/28 - 9:44.
 */
@Component
@EnableScheduling
public class JobTestService {

    @Autowired
    private TecService tecService;

    @XxlJob("gwqStartJob")
    private void gwqStartJob(){
        tecService.retMess();
        System.out.println("gwq自建定时任务开始了！！---->1");
    }

    @XxlJob("gwqStartJob1")
    private void gwqStartJob1(){
        System.out.println("gwq自建定时任务开始了！！---->2");
    }

    @XxlJob("gwqStartJob2")
    private void gwqStartJob2(){
        System.out.println("gwq自建定时任务开始了！！---->3");
    }

    @XxlJob("gwqStartJob3")
    private void gwqStartJob3(){
        System.out.println("gwq自建定时任务开始了！！---->4");
    }

    @XxlJob("gwqStartJob4")
    private void gwqStartJob4(){
        System.out.println("gwq自建定时任务开始了！！---->5");
    }

    @XxlJob("gwqStartJob5")
    private void gwqStartJob5(){
        System.out.println("gwq自建定时任务开始了！！---->6");
    }

    @XxlJob("gwqStartJob6")
    private void gwqStartJob6(){
        System.out.println("gwq自建定时任务开始了！！---->7");
    }

    @XxlJob("gwqStartJob7")
    private void gwqStartJob7(){
        System.out.println("gwq自建定时任务开始了！！---->8");
    }

    @XxlJob("gwqStartJob8")
    private void gwqStartJob8(){
        System.out.println("gwq自建定时任务开始了！！---->9");
    }

    @XxlJob("gwqStartJob9")
    private void gwqStartJob9(){
        System.out.println("gwq自建定时任务开始了！！---->10");
    }

    @XxlJob("gwqStartJob10")
    private void gwqStartJob10(){
        System.out.println("gwq自建定时任务开始了！！---->11");
    }

    @XxlJob("gwqStartJob11")
    private void gwqStartJob11(){
        System.out.println("gwq自建定时任务开始了！！---->12");
    }

    @XxlJob("gwqStartJob12")
    private void gwqStartJob12(){
        System.out.println("gwq自建定时任务开始了！！---->13");
    }

    @XxlJob("gwqStartJob13")
    private void gwqStartJob13(){
        System.out.println("gwq自建定时任务开始了！！---->14");
    }

    @XxlJob("gwqStartJob14")
    private void gwqStartJob14(){
        System.out.println("gwq自建定时任务开始了！！---->15");
    }

    @XxlJob("gwqStartJob15")
    private void gwqStartJob15(){
        System.out.println("gwq自建定时任务开始了！！---->16");
    }

    @XxlJob("gwqStartJob16")
    private void gwqStartJob16(){
        System.out.println("gwq自建定时任务开始了！！---->16");
    }

    @XxlJob("gwqStartJob17")
    private void gwqStartJob17(){
        System.out.println("gwq自建定时任务开始了！！---->17");
    }

    @XxlJob("gwqStartJob18")
    private void gwqStartJob18(){
        System.out.println("gwq自建定时任务开始了！！---->18");
    }

    @XxlJob("gwqStartJob19")
    private void gwqStartJob19(){
        XxlJobHelper.log("XXL-JOB, Hello World.");
        System.out.println("gwq自建定时任务开始了！！---->19");
    }

    @XxlJob("gwqStartJob20")
    private void gwqStartJob20(){
        System.out.println("gwq自建定时任务开始了！！---->20");
    }

    @XxlJob("gwqStartJob21")
    private void gwqStartJob21(){
        System.out.println("gwq自建定时任务开始了！！---->21");
    }

    @XxlJob("gwqStartJob22")
    private void gwqStartJob22(){
        System.out.println("gwq自建定时任务开始了！！---->22");
    }

    @XxlJob("gwqStartJob23")
    private void gwqStartJob23(){
        System.out.println("gwq自建定时任务开始了！！---->23");
    }

    @XxlJob("gwqStartJob24")
    private void gwqStartJob24(){
        System.out.println("gwq自建定时任务开始了！！---->24");
    }

    @XxlJob("gwqStartJob25")
    private void gwqStartJob25(){
        System.out.println("gwq自建定时任务开始了！！---->25");
    }

    @XxlJob("gwqStartJob26")
    private void gwqStartJob26(){
        System.out.println("gwq自建定时任务开始了！！---->26");
    }

    @XxlJob("gwqStartJob27")
    private void gwqStartJob27(){
        System.out.println("gwq自建定时任务开始了！！---->27");
    }

    @XxlJob("gwqStartJob28")
    private void gwqStartJob28(){
        System.out.println("gwq自建定时任务开始了！！---->28");
    }

    @XxlJob("gwqStartJob29")
    private void gwqStartJob29(){
        System.out.println("gwq自建定时任务开始了！！---->29");
    }

    @XxlJob("gwqStartJob30")
    private void gwqStartJob30(){
        System.out.println("gwq自建定时任务开始了！！---->30");
    }

    @XxlJob("gwqStartJob31")
    private void gwqStartJob31(){
        System.out.println("gwq自建定时任务开始了！！---->31");
    }

    @XxlJob("gwqStartJob32")
    private void gwqStartJob32(){
        System.out.println("gwq自建定时任务开始了！！---->32");
    }

    @XxlJob("gwqStartJob33")
    private void gwqStartJob33(){
        System.out.println("gwq自建定时任务开始了！！---->33");
    }

    @XxlJob("gwqStartJob34")
    private void gwqStartJob34(){
        System.out.println("gwq自建定时任务开始了！！---->34");
    }

    @XxlJob("gwqStartJob35")
    private void gwqStartJob35(){
        System.out.println("gwq自建定时任务开始了！！---->35");
    }

    @XxlJob("gwqStartJob36")
    private void gwqStartJob36(){
        System.out.println("gwq自建定时任务开始了！！---->36");
    }

    @XxlJob("gwqStartJob37")
    private void gwqStartJob37(){
        System.out.println("gwq自建定时任务开始了！！---->37");
    }

    @XxlJob("gwqStartJob38")
    private void gwqStartJob38(){
        System.out.println("gwq自建定时任务开始了！！---->38");
    }

    @XxlJob("gwqStartJob39")
    private void gwqStartJob39(){
        System.out.println("gwq自建定时任务开始了！！---->39");
    }

    @XxlJob("gwqStartJob40")
    private void gwqStartJob40(){
        System.out.println("gwq自建定时任务开始了！！---->40");
    }

    @XxlJob("gwqStartJob41")
    private void gwqStartJob41(){
        System.out.println("gwq自建定时任务开始了！！---->41");
    }

    @XxlJob("gwqStartJob42")
    private void gwqStartJob42(){
        System.out.println("gwq自建定时任务开始了！！---->42");
    }

    @XxlJob("gwqStartJob43")
    private void gwqStartJob43(){
        System.out.println("gwq自建定时任务开始了！！---->43");
    }

    @XxlJob("gwqStartJob44")
    private void gwqStartJob44(){
        System.out.println("gwq自建定时任务开始了！！---->44");
    }

    @XxlJob("gwqStartJob45")
    private void gwqStartJob45(){
        System.out.println("gwq自建定时任务开始了！！---->45");
    }

    @XxlJob("gwqStartJob46")
    private void gwqStartJob46(){
        System.out.println("gwq自建定时任务开始了！！---->46");
    }

    @XxlJob("gwqStartJob47")
    private void gwqStartJob47(){
        System.out.println("gwq自建定时任务开始了！！---->47");
    }

    @XxlJob("gwqStartJob48")
    private void gwqStartJob48(){
        System.out.println("gwq自建定时任务开始了！！---->48");
    }

    @XxlJob("gwqStartJob49")
    private void gwqStartJob49(){
        for(int i =0 ;i<=900000000;i++){
            if(i == 0){
                System.out.println("gwq自建定时任务开始了！！---->49--->"+"开始");
            }
            if (i == 900000000){
                System.out.println("gwq自建定时任务开始了！！---->49--->"+"结束");
            }
        }
    }

    @XxlJob("gwqStartJob50")
//    @Scheduled(initialDelay =5000 ,fixedDelay=5000 )
    private void gwqStartJob50(){
        System.out.println("gwq自建定时任务开始了！！---->50");
    }

}
