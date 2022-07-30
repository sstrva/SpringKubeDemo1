package com.example.springkubedemo1.Service;

import org.springframework.stereotype.Service;

@Service
public class DataService {
    public static String getForecast(){
            String data = "{\n" +
                    "    \"lat\": 59.3326,\n" +
                    "    \"lon\": 18.0649,\n" +
                    "    \"timezone\": \"Europe/Stockholm\",\n" +
                    "    \"timezone_offset\": 3600,\n" +
                    "    \"daily\": [\n" +
                    "        {\n" +
                    "            \"dt\": 1637229600,\n" +
                    "            \"sunrise\": 1637218142,\n" +
                    "            \"sunset\": 1637245026,\n" +
                    "            \"moonrise\": 1637244360,\n" +
                    "            \"moonset\": 1637213100,\n" +
                    "            \"moon_phase\": 0.47,\n" +
                    "            \"temp\": {\n" +
                    "                \"day\": 3.73,\n" +
                    "                \"min\": 2.79,\n" +
                    "                \"max\": 5.56,\n" +
                    "                \"night\": 3.56,\n" +
                    "                \"eve\": 3.45,\n" +
                    "                \"morn\": 3.84\n" +
                    "            },\n" +
                    "            \"feels_like\": {\n" +
                    "                \"day\": 0.7,\n" +
                    "                \"night\": 1.2,\n" +
                    "                \"eve\": 0.44,\n" +
                    "                \"morn\": -0.1\n" +
                    "            },\n" +
                    "            \"pressure\": 1006,\n" +
                    "            \"humidity\": 78,\n" +
                    "            \"dew_point\": 0.25,\n" +
                    "            \"wind_speed\": 5.22,\n" +
                    "            \"wind_deg\": 278,\n" +
                    "            \"wind_gust\": 12.7,\n" +
                    "            \"weather\": [\n" +
                    "                {\n" +
                    "                    \"id\": 800,\n" +
                    "                    \"main\": \"Clear\",\n" +
                    "                    \"description\": \"clear sky\",\n" +
                    "                    \"icon\": \"01d\"\n" +
                    "                }\n" +
                    "            ],\n" +
                    "            \"clouds\": 2,\n" +
                    "            \"pop\": 0.75,\n" +
                    "            \"uvi\": 0.27\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dt\": 1637316000,\n" +
                    "            \"sunrise\": 1637304684,\n" +
                    "            \"sunset\": 1637331311,\n" +
                    "            \"moonrise\": 1637331240,\n" +
                    "            \"moonset\": 1637304480,\n" +
                    "            \"moon_phase\": 0.5,\n" +
                    "            \"temp\": {\n" +
                    "                \"day\": 6.52,\n" +
                    "                \"min\": 3.51,\n" +
                    "                \"max\": 10.81,\n" +
                    "                \"night\": 7.61,\n" +
                    "                \"eve\": 10.27,\n" +
                    "                \"morn\": 3.51\n" +
                    "            },\n" +
                    "            \"feels_like\": {\n" +
                    "                \"day\": 3.36,\n" +
                    "                \"night\": 3.48,\n" +
                    "                \"eve\": 9.13,\n" +
                    "                \"morn\": 1.02\n" +
                    "            },\n" +
                    "            \"pressure\": 997,\n" +
                    "            \"humidity\": 90,\n" +
                    "            \"dew_point\": 4.96,\n" +
                    "            \"wind_speed\": 10.07,\n" +
                    "            \"wind_deg\": 303,\n" +
                    "            \"wind_gust\": 19,\n" +
                    "            \"weather\": [\n" +
                    "                {\n" +
                    "                    \"id\": 804,\n" +
                    "                    \"main\": \"Clouds\",\n" +
                    "                    \"description\": \"overcast clouds\",\n" +
                    "                    \"icon\": \"04d\"\n" +
                    "                }\n" +
                    "            ],\n" +
                    "            \"clouds\": 100,\n" +
                    "            \"pop\": 0.24,\n" +
                    "            \"uvi\": 0.18\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dt\": 1637402400,\n" +
                    "            \"sunrise\": 1637391225,\n" +
                    "            \"sunset\": 1637417600,\n" +
                    "            \"moonrise\": 1637418360,\n" +
                    "            \"moonset\": 1637395860,\n" +
                    "            \"moon_phase\": 0.53,\n" +
                    "            \"temp\": {\n" +
                    "                \"day\": 5.07,\n" +
                    "                \"min\": 3.46,\n" +
                    "                \"max\": 6.87,\n" +
                    "                \"night\": 3.46,\n" +
                    "                \"eve\": 3.88,\n" +
                    "                \"morn\": 5.59\n" +
                    "            },\n" +
                    "            \"feels_like\": {\n" +
                    "                \"day\": 2.76,\n" +
                    "                \"night\": 0.05,\n" +
                    "                \"eve\": 1.37,\n" +
                    "                \"morn\": 1.3\n" +
                    "            },\n" +
                    "            \"pressure\": 1005,\n" +
                    "            \"humidity\": 70,\n" +
                    "            \"dew_point\": -0.05,\n" +
                    "            \"wind_speed\": 7.9,\n" +
                    "            \"wind_deg\": 311,\n" +
                    "            \"wind_gust\": 15.17,\n" +
                    "            \"weather\": [\n" +
                    "                {\n" +
                    "                    \"id\": 804,\n" +
                    "                    \"main\": \"Clouds\",\n" +
                    "                    \"description\": \"overcast clouds\",\n" +
                    "                    \"icon\": \"04d\"\n" +
                    "                }\n" +
                    "            ],\n" +
                    "            \"clouds\": 96,\n" +
                    "            \"pop\": 0,\n" +
                    "            \"uvi\": 0.2\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dt\": 1637488800,\n" +
                    "            \"sunrise\": 1637477765,\n" +
                    "            \"sunset\": 1637503891,\n" +
                    "            \"moonrise\": 1637506020,\n" +
                    "            \"moonset\": 1637487000,\n" +
                    "            \"moon_phase\": 0.56,\n" +
                    "            \"temp\": {\n" +
                    "                \"day\": 1.61,\n" +
                    "                \"min\": 0.51,\n" +
                    "                \"max\": 3.12,\n" +
                    "                \"night\": 0.62,\n" +
                    "                \"eve\": 1.72,\n" +
                    "                \"morn\": 0.6\n" +
                    "            },\n" +
                    "            \"feels_like\": {\n" +
                    "                \"day\": -3.05,\n" +
                    "                \"night\": -4.27,\n" +
                    "                \"eve\": -2.98,\n" +
                    "                \"morn\": -2.86\n" +
                    "            },\n" +
                    "            \"pressure\": 998,\n" +
                    "            \"humidity\": 82,\n" +
                    "            \"dew_point\": -1.19,\n" +
                    "            \"wind_speed\": 7.53,\n" +
                    "            \"wind_deg\": 24,\n" +
                    "            \"wind_gust\": 12.83,\n" +
                    "            \"weather\": [\n" +
                    "                {\n" +
                    "                    \"id\": 600,\n" +
                    "                    \"main\": \"Snow\",\n" +
                    "                    \"description\": \"light snow\",\n" +
                    "                    \"icon\": \"13d\"\n" +
                    "                }\n" +
                    "            ],\n" +
                    "            \"clouds\": 71,\n" +
                    "            \"pop\": 0.86,\n" +
                    "            \"snow\": 0.98,\n" +
                    "            \"uvi\": 0.23\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dt\": 1637575200,\n" +
                    "            \"sunrise\": 1637564303,\n" +
                    "            \"sunset\": 1637590185,\n" +
                    "            \"moonrise\": 1637594520,\n" +
                    "            \"moonset\": 1637577540,\n" +
                    "            \"moon_phase\": 0.59,\n" +
                    "            \"temp\": {\n" +
                    "                \"day\": -0.57,\n" +
                    "                \"min\": -1.97,\n" +
                    "                \"max\": 0.75,\n" +
                    "                \"night\": 0.2,\n" +
                    "                \"eve\": 0.02,\n" +
                    "                \"morn\": -1.82\n" +
                    "            },\n" +
                    "            \"feels_like\": {\n" +
                    "                \"day\": -5.06,\n" +
                    "                \"night\": -5.38,\n" +
                    "                \"eve\": -4.87,\n" +
                    "                \"morn\": -5.89\n" +
                    "            },\n" +
                    "            \"pressure\": 1024,\n" +
                    "            \"humidity\": 58,\n" +
                    "            \"dew_point\": -7.9,\n" +
                    "            \"wind_speed\": 6.38,\n" +
                    "            \"wind_deg\": 238,\n" +
                    "            \"wind_gust\": 15.47,\n" +
                    "            \"weather\": [\n" +
                    "                {\n" +
                    "                    \"id\": 801,\n" +
                    "                    \"main\": \"Clouds\",\n" +
                    "                    \"description\": \"few clouds\",\n" +
                    "                    \"icon\": \"02d\"\n" +
                    "                }\n" +
                    "            ],\n" +
                    "            \"clouds\": 13,\n" +
                    "            \"pop\": 0,\n" +
                    "            \"uvi\": 0.24\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dt\": 1637661600,\n" +
                    "            \"sunrise\": 1637650839,\n" +
                    "            \"sunset\": 1637676482,\n" +
                    "            \"moonrise\": 1637684280,\n" +
                    "            \"moonset\": 1637666940,\n" +
                    "            \"moon_phase\": 0.62,\n" +
                    "            \"temp\": {\n" +
                    "                \"day\": 4.24,\n" +
                    "                \"min\": 0.81,\n" +
                    "                \"max\": 5.18,\n" +
                    "                \"night\": 2.5,\n" +
                    "                \"eve\": 3.54,\n" +
                    "                \"morn\": 2.38\n" +
                    "            },\n" +
                    "            \"feels_like\": {\n" +
                    "                \"day\": 0.37,\n" +
                    "                \"night\": -1.13,\n" +
                    "                \"eve\": -0.11,\n" +
                    "                \"morn\": -2.75\n" +
                    "            },\n" +
                    "            \"pressure\": 1010,\n" +
                    "            \"humidity\": 90,\n" +
                    "            \"dew_point\": 2.71,\n" +
                    "            \"wind_speed\": 7.24,\n" +
                    "            \"wind_deg\": 242,\n" +
                    "            \"wind_gust\": 16.07,\n" +
                    "            \"weather\": [\n" +
                    "                {\n" +
                    "                    \"id\": 804,\n" +
                    "                    \"main\": \"Clouds\",\n" +
                    "                    \"description\": \"overcast clouds\",\n" +
                    "                    \"icon\": \"04d\"\n" +
                    "                }\n" +
                    "            ],\n" +
                    "            \"clouds\": 100,\n" +
                    "            \"pop\": 0,\n" +
                    "            \"uvi\": 1\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dt\": 1637748000,\n" +
                    "            \"sunrise\": 1637737374,\n" +
                    "            \"sunset\": 1637762783,\n" +
                    "            \"moonrise\": 1637775000,\n" +
                    "            \"moonset\": 1637755260,\n" +
                    "            \"moon_phase\": 0.65,\n" +
                    "            \"temp\": {\n" +
                    "                \"day\": 7.48,\n" +
                    "                \"min\": 0.12,\n" +
                    "                \"max\": 7.48,\n" +
                    "                \"night\": 0.12,\n" +
                    "                \"eve\": 4.37,\n" +
                    "                \"morn\": 5.61\n" +
                    "            },\n" +
                    "            \"feels_like\": {\n" +
                    "                \"day\": 3.88,\n" +
                    "                \"night\": -4.16,\n" +
                    "                \"eve\": 0.23,\n" +
                    "                \"morn\": 1.36\n" +
                    "            },\n" +
                    "            \"pressure\": 995,\n" +
                    "            \"humidity\": 71,\n" +
                    "            \"dew_point\": 2.57,\n" +
                    "            \"wind_speed\": 6.87,\n" +
                    "            \"wind_deg\": 260,\n" +
                    "            \"wind_gust\": 13.81,\n" +
                    "            \"weather\": [\n" +
                    "                {\n" +
                    "                    \"id\": 500,\n" +
                    "                    \"main\": \"Rain\",\n" +
                    "                    \"description\": \"light rain\",\n" +
                    "                    \"icon\": \"10d\"\n" +
                    "                }\n" +
                    "            ],\n" +
                    "            \"clouds\": 83,\n" +
                    "            \"pop\": 0.2,\n" +
                    "            \"rain\": 0.11,\n" +
                    "            \"uvi\": 1\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dt\": 1637834400,\n" +
                    "            \"sunrise\": 1637823906,\n" +
                    "            \"sunset\": 1637849086,\n" +
                    "            \"moonrise\": 1637866380,\n" +
                    "            \"moonset\": 1637842860,\n" +
                    "            \"moon_phase\": 0.68,\n" +
                    "            \"temp\": {\n" +
                    "                \"day\": -1.82,\n" +
                    "                \"min\": -3.2,\n" +
                    "                \"max\": -0.79,\n" +
                    "                \"night\": -3.2,\n" +
                    "                \"eve\": -2.46,\n" +
                    "                \"morn\": -2.22\n" +
                    "            },\n" +
                    "            \"feels_like\": {\n" +
                    "                \"day\": -5.44,\n" +
                    "                \"night\": -6.45,\n" +
                    "                \"eve\": -5.67,\n" +
                    "                \"morn\": -6.59\n" +
                    "            },\n" +
                    "            \"pressure\": 1001,\n" +
                    "            \"humidity\": 71,\n" +
                    "            \"dew_point\": -6.38,\n" +
                    "            \"wind_speed\": 3.67,\n" +
                    "            \"wind_deg\": 337,\n" +
                    "            \"wind_gust\": 6.97,\n" +
                    "            \"weather\": [\n" +
                    "                {\n" +
                    "                    \"id\": 803,\n" +
                    "                    \"main\": \"Clouds\",\n" +
                    "                    \"description\": \"broken clouds\",\n" +
                    "                    \"icon\": \"04d\"\n" +
                    "                }\n" +
                    "            ],\n" +
                    "            \"clouds\": 53,\n" +
                    "            \"pop\": 0,\n" +
                    "            \"uvi\": 1\n" +
                    "        }\n" +
                    "    ]\n" +
                    "}";
            return data;
        }

}
